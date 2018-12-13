package drawdemo;


import java.awt.*;
import java.util.*;
import java.awt.event.*;
 
@SuppressWarnings("serial")
public class DrawDemo extends Canvas implements ActionListener {
	public HashMap<String, Figure> figList;
 
	public DrawDemo() {
		Frame f = new Frame("Welcome to Drawing Demo");
		TextField userInput = new TextField(" コマンドを入れてください ");
		f.addWindowListener(new WindowAdapter() { //  ウィンドウを閉じると終了
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setLayout(new BorderLayout()); //  ウィンドウ内の部品の配置
		f.setSize(800, 600);
		f.add("North", userInput);
		f.add("Center", this);
		userInput.addActionListener(this); //  テキストフィールドのリスナ設定
		f.setVisible(true); //  ウィンドウを見せる
		figList = new LinkedHashMap<String, Figure>(); //  図形を管理するリスト
	}
 
	public void paint(Graphics g) { // figList 中にある図形を再描画時に描画
		Iterator<String> itr = figList.keySet().iterator(); //  反復子
		while (itr.hasNext()) {
			Figure f = figList.get(itr.next());
			f.draw(g); //  各図形インスタンスの描画メソッドを呼ぶ
		}
	}
 
	// actionPerformed: ActionListner のメソッド ( インタフェースの実装 )
	public void actionPerformed(ActionEvent e) { //  入力完了時の処理
		String str = ((TextField) e.getSource()).getText(); //  入力文字列
		Scanner kb = new Scanner(str); //  入力文字列の Scanner を生成
		Figure fig; //  作業用変数
		int x, y;
 
		str = kb.next(); //  最初のトークン ( コマンドのはず ) 読み込み
		if (str.equals("create")) { //  新しい図形の生成 ?
			str = kb.next(); //  図形のタイプを読み込み,インスタンス生成
			if (str.equals("circle")) {
				fig = new Circle();
			} else if (str.equals("triangle")) {
				fig = new Triangle();
			} else if (str.equals("rectangle")) {
				fig = new Rectangle();
			} else if (str.equals("filledrectangle")) {
				fig = new FilledRectangle();
			}else if (str.equals("line")) {
				fig = new Line();
			} else { //  知らない図形タイプ
				fig = null;
				System.out.println(" そんなん作れません ");
			}
			if (fig != null) { //  インスタンスを生成したら parse メソッドに
				fig.parse(kb); // Scanner を渡して残りのパラメタを処理
				figList.put(fig.getName(), fig); //  リストに図形を登録
			}
		} else if (str.equals("move")) { //  既存の図形を移動 ?
			str = kb.next(); //  図形の名前を読み込み
			fig = figList.get(str); //  図形リストを検索
			if (fig == null) {
				System.out.println(str + " なんてないっす ");
			} else { //  移動量を読み込んで move メソッドを呼ぶ
				x = kb.nextInt();
				y = kb.nextInt();
				fig.move(x, y);
			}
		} else if (str.equals("delete")) { //  既存の図形を削除 ?
			str = kb.next(); //  図形の名前を読み込み
			if (figList.get(str) != null) { //  あれば削除
				figList.remove(str);
			} else {
				System.out.println(str + " なんてないっす ");
			}
		} else if (str.equals("clear")) { //  画面クリア ?
			figList.clear(); //  図形リストをクリア
		} else if (str.equals("exit")) { //  プログラム終了 ?
			System.exit(0);
		} else {
			System.out.println(" 何いってんのかわかりません ");
		}
		repaint(); // Canvas クラスのメソッド
	}
 
	public static void main(String[] args) {
		new DrawDemo(); // DrawDemo のインスタンスを生成
	}
}
 
abstract class Figure {
	int x, y; //  重心の (x,y) 座標
	String name; //  図形の名前
 
	public String getName() {
		return name;
	} //  名前を返す
 
	abstract void parse(Scanner s); //  以下抽象クラス
 
	abstract void move(int dx, int dy); //  これらは派生クラスで実装される
 
	abstract void draw(Graphics g); //  図形毎に処理が違う !
}
 
class Circle extends Figure {
	int r;
 
	void parse(Scanner s) { // "create circle ↓x y r name" 次は ↓ から読み込み
		this.x = s.nextInt(); //  重心:親の Figure クラスのフィールド
		this.y = s.nextInt();
		this.r = s.nextInt(); //  半径: Circle クラスのフィールド
		this.name = s.next(); //  名前:親の Figure クラスのフィールド
	}
 
	void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
 
	void draw(Graphics g) {
		g.drawOval(x - r, y - r, 2 * r, 2 * r);
	}
}
 
abstract class Polygon extends Figure { // Triangle, Rectangle に共通の
	int[] xs, ys; // move, draw を実装
 
	void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
		for (int i = 0; i < xs.length; i++) {
			this.xs[i] += dx;
			this.ys[i] += dy;
		}
	}
 
	void draw(Graphics g) {
		g.drawPolygon(xs, ys, xs.length);
	}
}
 
class Triangle extends Polygon {
	void parse(Scanner s) { // "create triangle ↓x1 y1 x2 y2 x3 y3 name"
		this.xs = new int[3];
		this.ys = new int[3];
		this.xs[0] = s.nextInt();
		this.ys[0] = s.nextInt();
		this.xs[1] = s.nextInt();
		this.ys[1] = s.nextInt();
		this.xs[2] = s.nextInt();
		this.ys[2] = s.nextInt();
		this.name = s.next();
		this.x = (xs[0] + xs[1] + xs[2]) / 3;
		this.y = (ys[0] + ys[1] + ys[2]) / 3;
	}
}
 
class Rectangle extends Polygon {
	int w, h;
 
	void parse(Scanner s) { // "create rectangle ↓x y w h name"
		this.xs = new int[4];
		this.ys = new int[4];
		this.x = s.nextInt();
		this.y = s.nextInt();
		this.w = s.nextInt();
		this.h = s.nextInt();
		this.name = s.next();
		this.xs[0] = x - w / 2;
		this.ys[0] = y - h / 2;
		this.xs[1] = x + w / 2;
		this.ys[1] = y - h / 2;
		this.xs[2] = x + w / 2;
		this.ys[2] = y + h / 2;
		this.xs[3] = x - w / 2;
		this.ys[3] = y + h / 2;
	}
}

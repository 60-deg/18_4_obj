package drawdemo;

import java.awt.Graphics;
import java.util.Scanner;

public class Line extends Figure {
	int x1, x2, y1, y2;
	void parse(Scanner s) { // "create line ↓x1 y1 x2 y2 name" 次は ↓ から読み込み
		this.x1 = s.nextInt(); //  始点のx座標
		this.y1 = s.nextInt();
		this.x2 = s.nextInt(); //  終点のx座標
		this.y2 = s.nextInt();
		
		this.x = (x1 + x2)/2;
		this.y = (y1 + y2)/2;
		this.name = s.next(); //  名前:親の Figure クラスのフィールド
	}
	
 
	void move(int dx, int dy) {
		this.x1 += dx;
		this.y1 += dy;
		this.x2 += dx;
		this.y2 += dy;
	}
 
	void draw(Graphics g) {
		g.drawLine(x1, y1, x2, y2);
	}
}

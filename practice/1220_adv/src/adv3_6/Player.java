package adv3_6;

/**
 * Player - 陽気な配管工兄弟ゲームでのプレイヤーを模したクラス．
 *
 * Javaは Double Dispatch ではなく Single Dispatch である． 実際に
 * レシーバ（メソッドを呼び出されるオブジェクト）やメソッド引数の型の違いによって どのように呼ばれるメソッドが変化するか試してみてください．
 *
 * ※ 講義資料から少し変化させています．
 *
 * @author tkobaya
 *
 */
public class Player {
    // Dispatchとは関係がありませんが，enumの使い方の例をここに入れてあります．

    // enum は"列挙型" という特別な型を宣言している．この場合は MARIO と LUIGI 以外を許さない型．
    // 特定の要素からなる情報を表現するために用いる．
    public enum PType {
        MARIO, LUIGI
    };

    // 列挙型は PType.Mario のように，型名＋要素の形で利用する．(switch文などでは省略ができる)
    protected PType type = PType.MARIO;

    void hit(GameObject go) {
        // A
        System.out.println(
                "(A)" + this.getClass().getSimpleName() + "(" + type + ") hit with GameObject (" + go.toString() + ")");
    }

    // 発展問題： このクラス内の hit(FireFlower) と hit(Turtle)をコメントアウトするとどうなるか？
    // 実際に動かしてみてなぜそれが起こるか説明してみよう．
    // void hit(FireFlower ff) {
    // // B
    // System.out.println("(B)" + this.getClass().getSimpleName() + "(" + type + ")
    // hit with FireFlower (" + ff + ")");
    // }

    void hit(Turtle t) {
        // C
        System.out.println("(C)" + this.getClass().getSimpleName() + "(" + type + ") hit with Turtle (" + t + ")");
    }

    public static void main(String... args) {
        GameObject go;
        Player p1 = new Player();
        go = new GameObject();
        p1.hit(go); // Aが実行される
        go = new FireFlower();
        p1.hit(go); // Bが実行されそうだが…

        Player p2 = new SuperPlayer();
        go = new Turtle();
        p2.hit(go); // Cが実行されそうだが… (Playerと出力が異なっていることに注意．なぜ起こる？)
        go = new FireFlower();
        p2.hit((FireFlower) go); // Dが実行されそうだが… ?
        go = new Turtle();
        p2.hit((Turtle) go); // Eが実行されそうだが… ?
        go = new FireFlower();
        ((SuperPlayer) p2).hit((FireFlower) go); // Dが実行されそうだが… ?
        go = new Turtle();
        ((SuperPlayer) p2).hit((Turtle) go); // Eが実行されそうだが… ?

    }
}

class SuperPlayer extends Player {

    // あえて Playerと同じ定義のままオーバライドしています．
    // Playerで定義をしないとどうなるか確認してみましょう．
    void hit(FireFlower ff) {
        // B
        System.out.println("(D)" + this.getClass().getSimpleName() + "(" + type + ") hit with FireFlower (" + ff + ")");
    }

    // あえて Playerと同じ定義のままオーバライドしています．
    // Playerで定義をしないとどうなるか確認してみましょう．
    void hit(Turtle t) {
        // C
        System.out.println("(E)" + this.getClass().getSimpleName() + "(" + type + ") hit with Turtle (" + t + ")");
    }

}

class FirePlayer extends SuperPlayer {
    // do nothing
}

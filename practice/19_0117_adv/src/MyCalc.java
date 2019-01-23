
import java.util.Scanner;

public class MyCalc {
	private static Scanner scan;

	private static Double Operate(Character op, Double a, Double b) {
		Double ret = (double) 0;
		switch (op) {
		case '+':
			ret = a + b;
			break;
		case '-':
			ret = a - b;
			break;
		case '*':
			ret = a * b;
			break;
		case '/':
			ret = a / b;
			break;
		}
		return ret;
	}

	private static String calc(String line) {
		// 括弧を取り除いてスペースで分割
		String[] params = line.replaceAll("[()]", "").split(" ");

		// 演算子と数値を取り出す
		Character op = params[0].charAt(0);
		Double a = Double.parseDouble(params[1]);
		Double b = Double.parseDouble(params[2]);

		// 演算結果をStringに直したものを返す
		return Operate(op, a, b).toString();
	}

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		while (true) {
			System.out.print("mycalc>");
			String line = scan.nextLine();
			if (line.equals("(exit)")) {
				break;
			} else {
				System.out.println(calc(line));
			}
		}
	}
}

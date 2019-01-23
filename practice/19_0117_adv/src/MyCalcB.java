import java.util.Scanner;
import java.util.Stack;

class StackNode {
	public String type;
	public Double value;
	public Character operator;

	public StackNode(Character operator) {
		this.type = "operator";
		this.operator = operator;
	}

	public StackNode(Double value) {
		this.type = "value";
		this.value = value;
	}
}

public class MyCalcB {
	private static Scanner scan;

	private static StackNode Operate(StackNode opNode, StackNode valNode1, StackNode valNode2) {
		// 演算子を取り出す
		Character op = opNode.operator;

		// 数値を取り出す
		Double a = valNode1.value, b = valNode2.value;

		// 演算を行う
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

		// 演算結果をのせたノードを返す
		return new StackNode(ret);
	}

	private static String getType(String param) {
		switch (param.charAt(0)) {
		case '+':
		case '-':
		case '*':
		case '/':
			return "operator";
		default:
			return "value";
		}
	}

	private static String calc(String line) {
		// 括弧を取り除いてスペースで分割
		String[] params = line.replaceAll("[()]", "").split(" ");

		// スタックを用意
		Stack<StackNode> stk = new Stack<StackNode>();

		for (int i = 0; i < params.length; i++) {
			// 配列の次の要素をスタックに積む
			String type = getType(params[i]);
			StackNode node;
			if (type.equals("value")) {
				Double value = Double.parseDouble(params[i]);
				node = new StackNode(value);
			} else if (type.equals("operator")) {
				Character operator = params[i].charAt(0);
				node = new StackNode(operator);
			} else {
				return "";
			}
			stk.push(node);

			while (stk.size() >= 2) {
				// スタックの上2つのノードを取り出す
				StackNode node1, node2;
				node2 = stk.pop();
				node1 = stk.pop();

				if (node1.type == "operator" || node2.type == "operator") {
					// どちらか一方が演算子だった場合は取り出したノードをそのまま戻してループを抜ける
					stk.push(node1);
					stk.push(node2);
					break;
				}

				// 両方とも数値の場合、その2つの演算結果のノードをスタックに積む
				StackNode opNode = stk.pop();
				stk.push(Operate(opNode, node1, node2));
			}
		}

		// 演算結果をStringに直したものを返す
		return stk.pop().value.toString();
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
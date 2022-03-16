package stackandqueue;

import java.util.Stack;

public class ExStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

		System.out.println(stack.size());

		System.out.println(stack.isEmpty());

		stack.push(6);
		stack.push(7);
		stack.push(8);

		System.out.println(stack.peek());
	}

}

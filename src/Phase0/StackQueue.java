package Phase0;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		stack.push(1);
		stack.push(2);

		System.out.println(stack.pop());

		String s = "{({}{{}}}[])}";

		Stack<Character> stack2 = new Stack<>();

		for (Character c : s.toCharArray()) {
			if (c == '(') {
				stack2.push(')');
			} else if (c == '{') {
				stack2.push('}');
			} else if (c == '[') {
				stack2.push(']');
			} else {
				if (stack2.isEmpty() || stack2.pop() != c) {
					System.out.println("false");
				}
			}
		}

		Deque<Integer> stack3 = new ArrayDeque<>();
	}
}

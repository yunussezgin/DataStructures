package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);

		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}

		System.out.println(queue.size());

		System.out.println(queue.isEmpty());

		queue.add(6);
		queue.add(7);
		queue.add(8);

		for (Integer q : queue) {
			System.out.println(q);
		}

		System.out.println(queue.peek());
	}
}

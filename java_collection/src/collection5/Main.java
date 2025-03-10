package collection5;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		// FIFO - 구조
		
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(100);
		q.offer(20);
		q.offer(343);
		
		System.out.println(q);
		
		q.poll();
		System.out.println(q);

	}

}

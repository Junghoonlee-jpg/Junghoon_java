package collection5;

import java.util.LinkedList;
import java.util.Stack;

public class Mainmt {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
//		list.add("틀린그림찾기");
//		list.add("벽돌깨기");
//		list.add("슈퍼마리오");
//		
//		list.contains("고인돌");
//		list.indexOf("벽돌깨기");
//		System.out.println(list.get(1));
		
		// 스택 - FILO 구조이다.
		// 웹 브라우저 히스토리, 계산기,메서드 호출
		Stack<String> stack = new Stack<>();
		stack.add("김미란");
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
	

	}

}

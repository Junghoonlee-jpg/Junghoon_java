package study0205;

import java.util.Scanner;

public class java2_0205 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 동전 앞면 뒷면 맞추기 게임
		// 내 돈이 바닥 날때까지 게임 진행!!
//		System.out.print("당신의 돈은 얼마? : ");
//		int money = scan.nextInt();
//		final int 판돈 = 1000; // 자바의 'final'과 자바스크립트의 'const'와 비슷 (변수 부여하고, 변경이 안됨);
//		int win = 0;
//		while(true) {
//			int coin = (int)(Math.random() * 2 + 1); // 1앞 2뒤
//			System.out.print("1. 앞면, 2. 뒷면 :");
//			int user = scan.nextInt();
//			if( user == coin ) 
//			{
//				System.out.println("정답!");
//				win++;
//			}
//			else
//				System.out.println("땡!");
//			money -= 판돈; // 1번 진행시 1000원씩 감소
//			if ( money < 판돈) break;				
//			}
//		System.out.println("내 돈은 : " + money);
//		System.out.println("정답 몇번 : " + win);
	
		
		
		
		// 21 ~ 49 -> * 29 + 21
		
		// 1 ~ 50번 중 컴퓨터와 내가 입력한 숫자가 일치할 때까지 계속 입력
//		int com = (int)(Math.random() * 50 + 1);
		
//		while(true) {
//			System.out.print("정수 입력 : ");
//			int num = scan.nextInt();
//			if( com == num) {
//				System.out.println("정답!");
//				break;
//			}
//			if( com > num) 
//				System.out.println("up");
//			if( com < num) 
//				System.out.println("down");
//			}
		
		// 1 ~ 50번 중 내가 입력한 숫자를 컴퓨터가 맞출때까지 자동 입력		
		
//		System.out.print("정수 입력 : ");	
//		int num = scan.nextInt();
//		
//		while(true) {
//			int com = (int)(Math.random() * 50 + 1);			
//			if( com == num) {
//				System.out.println("정답!");
//				break;
//			}
//			if( com > num) 
//				System.out.println("up");
//			if( com < num) 
//				System.out.println("down");
//			}
		
		
		
	
		
//		for(초기값; 조건식; 증감식)
//		for(int i = 1; i <= 10; i++)
//		반복 횟수가 정해져 있는 경우 for문이 가독성이 좋다.
//		반복횟수가 없는 경우 while문이 가독성이 좋다.
		
//		int i = 1; // 초기값
//		
//		while(i <= 10) 
//		{ // 조건식
//			System.out.println(i);
//			i++; // 증감식
//		}
			
//		if(조건식) {
//			
//		}
		
		// 오늘의 과제
		// 1 ~ 50 중 하나를 내가 입력한다.
		// 내가 입력한 숫자를 컴퓨터가 맞춰야 한다. (random 사용)
		// 무작위로 맞추는게 아니고 범위를 좁히면서 맞출수 있도록 해야한다.
		
//		System.out.print("정수 입력 : ");	
//		int num = scan.nextInt();
//		
//		while(true) {
//			int com = (int)(Math.random() * 50 + 1);			
//			if( com == num) {
//				System.out.println("정답!");
//				break;
//			}
//			if( com > num) 
//				System.out.println("up");
//			if( com < num) 
//				System.out.println("down");
//			}

	}

}

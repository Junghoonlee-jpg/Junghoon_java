package study0207;

import java.util.Scanner;

public class java_0207 {

	public static void main(String[] args) {
		
		
//		오늘 의 과제  
//	     베스킨라빈스 31 게임 만들기
//	     나와 컴퓨터 둘이서 진행 
//	     31을 제시하는 쪽이 패배 
//	     나 부터 시작 한다. 
//	     숫자 몇개를 제시할것인지 갯수를 입력하면 자동으로 숫자가 나온다.
//	     컴퓨터는 랜덤을 이용해서 몇개 제시할것인지 해야한다.
//	     숫자는 1개 부터 3개까지 가능
		
		Scanner sc = new Scanner(System.in);
		
		int me = 0, com = 0, num = 1;
		
		while(true) { // 언제 31이 나올지 모르니 무한루프로 전체를 반복
			System.out.print("\n숫자 몇개 : ");
			me = sc.nextInt();
			// 1~3 사이 값 입력 했는지 체크 하는 반복문 만들면 좋음
			System.out.print("나 : ");
			for(int i = 1; i <= me; i++) {
				System.out.print((num++) + " ");
				if(num == 32) break; // for문 종료				
			}	
			if(num == 32) {
				System.out.println("내가 졌다...");
				break; // while 종료
		}
			com = (int)(Math.random()*3+1); // 1~3개중 하나
			System.out.print("\n컴퓨터 : ");
			for(int i = 1; i<=com; i++) {
				System.out.print((num++) + " ");
				if(num == 32) break;
			}
			if(num == 32) {
				System.out.println("컴퓨터 패배!!");
				break; // while 종료
			}			
		}
		
//		int nom = 1;
//		while(true) {
//			System.out.print("입력할 숫자 갯수 : ");
//			int me = sc.nextInt();
//			int com = (int)(Math.random()*3+1);
//			if(me == 1) {
//				System.out.println("나 : " + nom++);
//				for (com = 1; com <= 3; com++) {
//					System.out.println("컴 : " + nom++);	
//					} 			
//			} else if(me == 2) {
//				System.out.println("나 : " + nom++ +","+ nom++);
//				for (com = 1; com <= 3; com++) {
//					System.out.println("컴 : " + nom++);
//					
//				}
//			}
//		}
	}
}


package study0204;

import java.util.Scanner;

public class javahw_0203 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * 과제 2월 3일
		 * 가위바위보 게임 만들기
		 * 1.가위 2.바위 3.보
		 * 내가 이겼는지, 졌는지, 비겼는지 출력
		 */
		 
		System.out.print("1.가위, 2.바위, 3.보 :");
		int user = sc.nextInt();
		
		int com = (int)(Math.random()*3+1);
		
		switch(user - com) {
			case 0:
				System.out.println("비김");
				break;
			case -2: // 내가 가위(1), 컴 보 (3)
			case 1: // 내가 바위(2) 또는 보(3), 컴 가위(1)또는 바위(2)
				System.out.println("이김");
				break;
			case -1:
			case 2:
				System.out.println("패배...");
		}
		
		
//		if( user ==1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2) {
//			System.out.println("승리하였습니다.");
//		}		
////		if(user == 1 && com == 3) {
////			System.out.println("승리하였습니다!");
////		}
////		else if(user == 2 && com == 1) {
////			System.out.println("승리하였습니다!");
////		}
////		else if(user == 3 && com == 2) {
////			System.out.println("승리하였습니다!");
////		}
//		else if(user == com ) {
//			System.out.println("비겼습니다");
//		} else {
//			System.out.println("패배...");
//		}
		
	}


	}


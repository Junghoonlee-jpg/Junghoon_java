package study0211;

import java.util.Arrays;
import java.util.Scanner;

public class java2_0211 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		
		int[] game = new int[25];
		
		// game배열에 값 채우기
		for(int i = 0; i<game.length; i++) 
			game[i] = (int)(Math.random()*50+1);

//			System.out.println(Arrays.toString(game));
		
			
		// 5줄 5칸 출력
		
		while(true) {
			
		for(int i = 0; i<=4; i++) { // 빙고판 출력
			for(int k = 0; k <= 4; k++) {
				if(game[i*5+k]==0)
					System.out.printf(" %2s ", "■");
				else
				System.out.printf(" %2d ", game[i*5+k]);
			}
			System.out.println();
		}
		
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt(); // 빙고판에 있는 숫자 입력
		
		for(int i = 0; i<game.length; i++) {
			if(game[i] == num) { // 내가 입력한 숫자를 배열에서 찾기
				game[i]=0;
				
				}
			
			}
		
		// 과제(금요일까지)
		// 빙고게임은 5줄 빙고되면 종료
		// 가로 세로 대각선 빙고로 취급
		// 힌트는 인덱스 규칙(i와k활용)
		// 중복으로 숫자 안들어가도록 변경
		
		// 시간이 된다면 컴퓨터와 같이 빙고하도록 출력
//		(컴퓨터의 숫자 선택도 사람처럼 빙고를 빠르게 할 수 있도록 숫자 선택)
		
		
		}

	}

}

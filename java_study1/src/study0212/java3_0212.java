package study0212;

import java.util.Scanner;

public class java3_0212 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] board = new int[][]
			{
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,2,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
			// 13줄 15칸, board[13][15]
		}; 
		
		int x = 0, y = 0;			
		while(true) {
			for(int i = 0; i<board.length; i++) { // i는 y축을 표현
				for(int k=0; k<board[i].length; k++) { // k는 x축을 표현
					if(board[i][k] == 1)
						System.out.printf("■");
					if(board[i][k] == 0) 
						System.out.printf(" ");
					if(board[i][k] == 2) {
						System.out.printf("@");
						x = k; y = i;
					}
					
				}
				System.out.println();
			} // 화면 그리기 반복문 끝
			
			// 이동 시키기 w,a,s,d
			System.out.print("방향 입력 : ");
			char key = input.nextLine().charAt(0);
			
			board[y][x]=0;
			switch(key) {
			case'w':
				if(board[y-1][x] !=1)
				y--;					
				break;
				
			case's':
				if(board[y+1][x] !=1)
				y++;							
				break;
				
			case'a':				
				if(board[y][x-1] !=1)
				x--;								
				break;
				
			case'd':				
				if(board[y][x+1] !=1)
				x++;								
				break;
			default:
				System.out.println("잘못입력");
			}
			board[y][x]=2;
			
			
		}

	}

}

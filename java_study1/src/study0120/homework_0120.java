package study0120;

public class homework_0120 {

	public static void main(String[] args) {
		
		int 사과1박스=20;
		int 오렌지1박스=15;
		int 사과총수량=사과1박스 * 11;
		int 오렌지총수량=오렌지1박스 * 12;
		int 총과일수량=사과총수량+오렌지총수량;
		
		System.out.println("총 과일 수량 : " + 총과일수량);
		
		int apple = 20;
		int appleBox = 11;
		int orange = 15;
		int orangeBox = 12;
		
		int totalApple = apple * appleBox;
		int totalOrange = orange * orangeBox;
		int totalFruit = totalApple + totalOrange;
		System.out.println("사과 총 갯수 : " + totalApple);
		System.out.println("오렌지 총 갯수 : " + totalOrange);
		System.out.println("과일 총 갯수 : " + totalFruit);
		
		
	}

}

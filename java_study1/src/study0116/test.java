package study0116;

public class test {

	public static void main(String[] args) {
		// 주석 - 설명이나 메모, 코드 대기, 등등
		/* 
		 * 여러줄 주석 -주석은 프로그램으로 실행 되지않는 부분이다.
		 * 주석안에 코드 작성해도 실행 안된다. 각 코드의 설명을 작성 하는용도로 사용
		 * 저장단축키 - ctrl + s
		 * 주석 단축키 - ctrl + /
		 * 실행 단축키 - ctrl + f11
		 */
		System.out.println("자바 이클립스 테스트");
		
		// 데이터를 사용 하려면 변수를 선언 해야 한다.
		// 변수를 선언 할때는 반드시 데이터 작업을 정해야한다.
		// 수의 이름은 저장할 데이터에 맞는 의미 있는 이름으로 짓기
		// 정수: byte, short, int, long
		// 실수: float, double
		// 문자: char
		// 논리: boolean
		int age;
		age = 100; // age 변수에 100 저장(대입연산)
		age = 27;
		age = '가'; //자바에서 '' 표현은 문자를 의미
					// "" 표현은 문자열을 의미
		
		String name="홍길동"; // 문자열은 String 클래스타입 사용
		
		boolean isApple = true; // 참, 거짓 값을 가지는 타입
		
		System.out.println( isApple );
	}

}

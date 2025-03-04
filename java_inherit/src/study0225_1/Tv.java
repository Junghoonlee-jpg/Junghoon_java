package study0225_1;

public class Tv extends Product{ // 자식클래스
	
	public Tv() { 
		super(); // 부모클래스의 생성자 메서드가 반드시 먼저 실행되야한다.
		System.out.println("자식클래스생성");
		// super(); // 부모클래스의 생성자메서드
		// super는 부모클래스의 객체를 의미한다.
	}
	public Tv(String brand, int price, String name) {
		super(brand, price, name);
		
	}
	
	// 오버라이딩
	// 상속관계인 경우, 인터페이스implements인 경우에 사용
	// 성립 조건
	// 1. 메서드의 원형은 그대로 유지
	// 2. 내용만 변경한다.
	// 3. 상속또는 implements인 경우에만 가능
		
	@Override	
	public void power() {
		onOff=!onOff;
		System.out.println("Tv전원 : " + onOff);
	}
	
}

package java_inner1;

public class MainMt {

	public static void main(String[] args) {

//		Test.A a = new Test.A();
		Test t = new Test();
		
		t.setNum(10); // 내부클래스 노출 안됨
		t.innerView();
		
		t.a.num = 10; // 내부클래스가 노출됨
		
		t.setYear(100);
		
		Test.A a = t.new A();
//		a.num = 10;
//		a.num = 20;
		
		// 정적 내부클래스를 굳이 노출하면서 객체를 만들고자 한다면
		Test.Dog dog = new Test.Dog();
		
		Test.origin(); // 클래스 메서드 실행은 객체 없이 가능하다.

	}

}

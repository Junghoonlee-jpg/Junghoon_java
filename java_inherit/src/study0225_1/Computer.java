package study0225_1;

public class Computer extends Product {
	
	public Computer() {}
	
	public Computer(String brand, int price, String name) {
		super(brand, price, name);
	}
	
	@Override	
	public void power() {
		onOff=!onOff;
		System.out.println("Computer전원 : " + onOff);
	}
}

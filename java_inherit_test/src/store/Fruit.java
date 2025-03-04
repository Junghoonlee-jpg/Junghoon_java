package store;

public abstract class Fruit { // 부모 클래스 - 추상 클래스
	protected int cost; // 판매 금액
	protected int capacity; // 용량
	
	protected Fruit() {}
	protected Fruit(int c, int cp) {
		this.cost = c;
		this.capacity = cp;
	}
	
	public abstract void makeJuice(); // 과일 주스 만들기
	public abstract void pieceFruit(); // 과일 소량 컵?에 팔기
		
	// 부모클래스가 가지고있는 메서드중 자식클래스에서 변경하고 싶지 않은 메서드가 있다면 
	// 예) public final void makeJuice();
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	

}

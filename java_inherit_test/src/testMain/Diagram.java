package testMain;

public abstract class Diagram { // 부모클래스
	
	protected int height;
	protected int width; 
	
	public Diagram() {}
	protected Diagram(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public abstract void draw(); // 추상메서드
	

}

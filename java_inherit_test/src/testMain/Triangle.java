package testMain;

public class Triangle extends Diagram {
	
	public Triangle(int w, int h) {
		super(w, h);
	}
	
	@Override
	public void draw() {
		System.out.println("밑변"+width+ " 높이 "+height+" 인 삼각형 그리기");
	}
}

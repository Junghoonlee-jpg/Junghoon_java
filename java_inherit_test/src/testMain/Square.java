package testMain;

public class Square extends Diagram {
	
	public Square(int w, int h) {
		super(w,h);
	}
	
	@Override
	public void draw() {
		System.out.println("밑변"+width+ " 높이 "+height+" 인 사각형 그리기");
	}

}

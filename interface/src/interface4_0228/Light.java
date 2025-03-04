package interface4_0228;

public class Light implements Remotecon {
	
	@Override
	public void powerOn() {
		System.out.println("전구의 전원이 켜집니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("전구의 전원이 꺼집니다.");
		
	}
	
	
}

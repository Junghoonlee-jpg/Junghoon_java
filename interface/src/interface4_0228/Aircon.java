package interface4_0228;

public class Aircon implements Remotecon {

	@Override
	public void powerOn() {
		System.out.println("에어컨의 전원이 켜집니다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("에어컨의 전원이 꺼집니다.");
		
	}

}

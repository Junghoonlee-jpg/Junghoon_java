package testMain;

public class Check extends Payment {
	
	public Check(int p, String d) {
		super(p, d);
	}
	
	@Override
	public void processPay() {
		System.out.println("체크카드 결제 금액 : "+pay+"원" +" + 결제일 : "+date);
	}

}

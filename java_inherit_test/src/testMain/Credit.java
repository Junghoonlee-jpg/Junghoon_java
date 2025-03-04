package testMain;

public class Credit extends Payment {
	public Credit(int p, String d) {
		super(p, d);
	}
	
	@Override
	public void processPay() {
		System.out.println("신용카드 결제 금액 : "+pay+"원" +" 결제일 : "+date);
	}
}

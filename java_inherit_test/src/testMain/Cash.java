package testMain;

public class Cash extends Payment {
	public Cash(int p, String d) {
		super(p, d);
	}
	
	@Override
	public void processPay() {
		System.out.println("현금 결제 금액 : "+pay+"원" +" 결제일 : "+date);
	}
}

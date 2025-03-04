package testMain;

public abstract class Payment {
	
	protected int pay;
	protected String date;
	
	public Payment() {}
	protected Payment(int p, String d) {
		this.pay = p;
		this.date = d;
	}
	
	public abstract void processPay();
}

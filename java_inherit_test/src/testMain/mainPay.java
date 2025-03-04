package testMain;

public class mainPay {

	public static void main(String[] args) {

		Credit r = new Credit(30000, "2025.02.02");
		r.processPay();
		
		Check c = new Check(25000, "2025.02.15");
		c.processPay();
		
		Cash h = new Cash(20000, "2025.02.16");
		h.processPay();

	}

}

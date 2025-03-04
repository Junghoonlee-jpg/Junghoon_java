package interface4_0228;

public class Mainm {

	public static void main(String[] args) {
		
		Remotecon[] rcon = new Remotecon[] {
				new Light(), new Tv(), new Aircon()
		};
		
		for(Remotecon con : rcon) {
			con.powerOn();
			con.powerOff();
		}

	}

}

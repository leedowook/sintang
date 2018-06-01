package d0530;

public class remoteconex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remotecon rc;
		rc=new tv();
		rc.turnon();
		rc.turnoff();
		rc.setM(true);
		
		rc=new audio();
		rc.turnon();
		rc.turnoff();
		rc.setM(true);
		
		remotecon.changeBattery();
	}

}

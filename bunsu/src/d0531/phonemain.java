package d0531;

public class phonemain {
	public static void main(String[] args) {
		smartphone sp=new smartphone();
		sp.mcall();
		sp.gcall();
		
		sp.rtext();
		sp.stext();
		sp.musicon();
		sp.vdown();
		sp.vup();
		sp.musicstop();
		System.out.println(sp.plus(4, 5));
	}

}

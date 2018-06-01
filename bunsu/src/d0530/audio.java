package d0530;

public class audio  implements remotecon  {
	//필드 선언
	private int volume;
	
	@Override
	public void turnon() {
		System.out.println("오디오를 켭니다.");
	}
	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 끕니다.");
	}
	@Override
	public void setv(int volume) {
		// TODO Auto-generated method stub
		if(volume>remotecon.max_v) {
			this.volume=remotecon.max_v;
		}
		else if(volume>remotecon.min_v) {
			this.volume=remotecon.min_v;
		
	}
	else {this.volume=volume;}
	System.out.println("볼륨: "+volume);
	}
	
	@Override
	public void setM(boolean mute) {
		// TODO Auto-generated method stub
		remotecon.super.setM(mute);
	}}
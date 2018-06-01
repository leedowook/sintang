package d0530;

public class tv implements remotecon {
	private int volume;
	public void turnon() {
		System.out.println("tv를 켭니다.");
	}
	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("tv를 끕니다.");
	}
	public void setv(int volume) {
		// TODO Auto-generated method stub
		if(volume>remotecon.max_v) {
			this.volume=remotecon.max_v;
		}
		else if(volume>remotecon.min_v) {
			this.volume=remotecon.min_v;
		
	}}
}

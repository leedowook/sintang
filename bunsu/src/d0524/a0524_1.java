
package d0524;
//getter, setter 메소드 사용예제
public class a0524_1 {
	//필드 선언
	private int sp;
	private boolean stop;
	public int getSp() {
		return sp;
	}
	public void setSp(int sp) {
		this.sp = sp;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	//메소드 선언
	//sp 필드에 대한 getter 메소드 선언
	/*public int getSp() {
		return sp;
	}
	public void setSp(int sp) {
		if(sp<0) {
			this.sp=0;
			return;
		}
		else{
			this.sp=sp;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop=stop;
		this.sp=0;
		
	}*/
}

package d0523;

public class a0523_6 {
	//필드 선언
	int gas;
	//메소드
	void setgas(int gas) {
		this.gas=gas;
	}
	
	boolean leftgas(){
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		else {
		System.out.println("가스가 있습니다.");
		return true;
		}
		
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas 잔량:"+gas+")");
				gas-=1;
				
			}
			else {
				System.out.println("멈춥니다(gas 잔량:"+gas+")");
				return;
			}
		}
		
	}
}

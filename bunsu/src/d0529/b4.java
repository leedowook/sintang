package d0529;
import java.util.*;
public class b4 {
	a4[] tire=new a4[4];
	Scanner scan=new Scanner(System.in);
	
	
	public void tr() {
		String 타이어 = null;
		int 내구도=0;
		for(int i=0;i<tire.length;i++) {
		if(i==0) {타이어="앞왼쪽"; 
			System.out.println("앞 왼쪽 타이어의 내구도를 입력하세요");
			내구도=scan.nextInt();}
		
		else if(i==1) {타이어="앞오른쪽";
		System.out.println("앞 오른쪽 타이어의 내구도를 입력하세요");
		내구도=scan.nextInt();}
		else if(i==2) {
		타이어="뒤왼쪽";
		System.out.println("뒤 왼쪽 타이어의 내구도를 입력하세요");
		내구도=scan.nextInt();}
		else if(i==3){타이어="뒤오른쪽";
		System.out.println("뒤 오른쪽 타이어의 내구도를 입력하세요");
		내구도=scan.nextInt();}
		
		tire[i]=new a4(타이어,내구도);
		}
	}
	int run() {//자동차가 출발하여 
		//각 바퀴별로 a4의 roll을 실행하여false 값이 나오면 리턴값으로 상황에 맞게 주고 멈추고 그외엔 0으로 리턴
		System.out.println("[자동차 출발]");
		
		for(int i=0;i<tire.length;)
		if(tire[i].roll()==false) {
			stop();return (i+1);
		}
		
		return 0;
	}
	void stop() {
		System.out.println("자동차를 정지합니다.");
	}
}

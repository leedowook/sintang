package d0517;

public class d0517_4 {

	public static void main(String[] args) {
		/*random매소드
		 * Math.random():double 실수 0.0<=     <1.0
		 * 만일 0~9일떈 10을 곱하고 int 로 형변환
		 * 만일 1~10을 원할떈 10을 곱하고 int로 형변환 후 1더하기
*/
		/*double x = Math.random();
		if(0.0<=x && x<1.0) {
			System.out.println(x+"띵동");
			
		}
		*/
		int x = (int)(Math.random()*6)+1;
		
		
		if(x==6) {System.out.println("주사위가 6이나왔습니다.");}
		else if(x==5) {System.out.println("주사위가 5이나왔습니다.");}
		else if(x==4) {System.out.println("주사위가 4이나왔습니다.");}
		else if(x==3) {System.out.println("주사위가 3이나왔습니다.");}
		else if(x==2) {System.out.println("주사위가 2이나왔습니다.");}
		else if(x==1) {System.out.println("주사위가 1이나왔습니다.");}
		
		
	}

}

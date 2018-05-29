package d0529;

public class e4 {

	public static void main(String[] args) {
		b4 car=new b4();//b4클래스를 car 클래스 변수로 선언
		car.tr();
		for(int i=1;i<=5;i++) {
			int prob=car.run();//자동차가 달렸을때 각 바퀴가 터지는 것을 나타낸
			//run을 실행 시켜서 그 안의 리턴 값을  아닐떈 0으로 그냥 지나가는 걸 반복
		
		switch(prob) {
		
		case 1: 
			System.out.println("앞 왼쪽 한국타이어로 교체");
			car.tire[0]=new c4("앞왼쪽",15);//오버라이딩한 c4의 값을 불러옴
			break;
		case 2: 
			System.out.println("앞 왼쪽 한국타이어로 교체");
			car.tire[1]=new c4("앞오른쪽",13);//오버라이딩한 c4의 값을 불러옴
			break;
		case 3: 
			System.out.println("뒷 왼쪽 금호타이어로 교체");
			car.tire[2]=new d4("뒷왼쪽",14);
			break;
		case 4: 
			System.out.println("뒷 오른쪽 금호타이어로 교체");
			car.tire[3]=new d4("뒷오른쪽",17);
			break;
		
		}
		System.out.println("------------------------------");
	}
}

}

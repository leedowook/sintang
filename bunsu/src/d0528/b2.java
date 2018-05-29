package d0528;

public class b2 extends a2{

	public int sn;
	public b2() {
		/*this.name=name;
		this.ssn=ssn;*/
		
		super();//부모클래스의 해당 매개벼누를 이용하는 생성자들 바로 호출
		System.out.println("학생번호를 입력해라");
		this.sn=scan.nextInt();
	}
}

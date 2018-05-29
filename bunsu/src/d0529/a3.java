package d0529;
class a{
	
}
class b extends a{
	
}
class c extends a{
	
}
class d extends b{
	
}
class e extends c{
	
}
public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//각 자식클래스 타입의 변수 자신을 선언
		b b=new b();
		c c=new c();
		d d=new d();
		e e=new e();
		//부모 클래스 타입에 자식클래스 넣기
		a a1=b;
		a a2=c;
		a a3=d;//손자
		a d4=e;//손자
		
		b b1=d;
		c c1=e;
		
		/*b b2=e;
		c c2=d;
		
		b b3=(b) a1;//강제형변환은 가능*/
	}

}

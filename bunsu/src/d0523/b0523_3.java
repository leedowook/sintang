package d0523;

public class b0523_3 {

	public static void main(String[] args) {
		//본인의 이름과 주민번호 앞자리로 k1, k2객체를 생성해서 필드값을 출력해보시오
		a0523_3 k1=new a0523_3("홍팔매","522143-45687");
			//a0523_3의 내용을 기초로한 새로운 k1 객체 생성 이름을 n에 넣고 name 에 들어감 c에 코드가 들어가고 ssn에 들어감
		a0523_3 k2=new a0523_3("육도래","522424-47892");
		    //a0523_3의 내용을 기초로한 새로운 k2 객체 생성 이름을 n에 넣고 name 에 들어감 c에 코드가 들어가고 ssn에 들어감
		System.out.println("k1의 값 주민번호"+k1.ssn+"이름"+k1.name);
		System.out.println("k2의 값 주민번호"+k2.ssn+"이름"+k2.name);
	}

}

package d0531;

public class stringindexof {

	public static void main(String[] args) {
		String subject="자바 프로그래밍";
		
		int location=subject.indexOf("프로그래밍");
		System.out.println("location의 값:"+location);
		System.out.println(subject.indexOf("자바"));//시작위치
		if(subject.indexOf("자바")!=-1){//시작위치가 없으면 0임
			System.out.println("자바와 관련이 있는 책이군요.");
		}else {System.out.println("자바와 관련이 없는 책이군요");}
		
		
		int length=subject.length();
		System.out.println("length의 값:"+length);//길이알려줌 띄어쓰기포함
		//replace메소드
		String newStr=subject.replace("자바","java");//해당 단어바꿈
		System.out.println("newStr의 값"+newStr);
		
		String ssn="180531-3456789";
		String firstNum=ssn.substring(0,6);//0~6까지
		String secondNum=ssn.substring(7);//그냥 7까지
		System.out.println("퍼스트넘"+firstNum);
		System.out.println("세컨드넘"+secondNum);
		
		String str3="abcDRGDFfdsfa";
		String l=str3.toLowerCase();
		String u=str3.toUpperCase();
		System.out.println("로우어 "+l);
		System.out.println("어퍼"+u);
	
		//trim()메소드
		String tel1="    02";
		String a=tel1.trim();
		System.out.println(a);
	}

}

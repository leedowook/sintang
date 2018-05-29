package bunsu516;

public class str1 {
	public static void main(String [] args) {
		String str0="스트링 변수 저장 및 선언";
		String str1="jdk"+8.8;
		String str2=str1+"특징";
		System.out.println(str2);
		
		String str3="jdk"+3+3.0;//앞에 문장이라서 
		String str4=3+3.0+"jdk";//연산 후 연결
		System.out.println(str3);
		System.out.println(str4);
	}
}

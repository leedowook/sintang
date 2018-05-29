package bunsu516;

public class d516_8 {
	public static void main(String[]args) {
		String strv1="본인이름";
		String strv2="본인이름";
		String strv3=new String("본인이름");
		System.out.println(strv1 == strv2);//선언한 문자가 같으므로 
		System.out.println(strv1 == strv3);
		/*strv3 =새로운 스트링 을 선언하고 거기에 넣어줌 "본인이름 "이라는?
		 
		 */
		System.out.println();//걍띄어쓰기
		System.out.println(strv1.equals("본인이름"));
		//strv1과 본인이름과 같은가?
		System.out.println(strv1.equals(strv3));
		//strv1과 새로운 스
	}
}

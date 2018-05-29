package bunsu516;

public class bunsu516_1 {

	public static void main(String[] args) {
		int intg=44032;
		char charg=(char)intg;
		//강제로 변환하는 이유는 인트가 차보다 커서 
		System.out.println(charg);//문자형 변수를 담는 차값이므로 해당 숫자는 유니코드에서 해당되는 값으로 변환
		
		long longg=500;
		intg=(int)longg;//인트가 롱보다 작아서 강제변환
		System.out.println(intg);
		//롱은  인트보다 큰값이나 해당 값이 인트의 최종치를 넘지 않았으므로
		double doubleg=3.14;
		intg=(int)doubleg;//더블이 인트보다 커서 강제변환
		System.out.println(intg);
		//더블값은 실수형이나 인트값은 정수형이므로 소수점 제외되어 대입

	}

}

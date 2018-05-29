package bunsu516;

public class bunsu516_2 {

	public static void main(String[] args) {
		byte bg=10;
		byte bg2=20;
		//byte bg3=(byte)(bg+bg2);//기본적으로 자바 계싼은 int 로 변환되어 계산이 되어 byte에 넣으면 넘치므로 안되서 강제변환
		int ig=bg+bg2;//어차피 byte 보다 int가 더큼 ㅇㅇ
		System.out.println(ig);
		
		char cg='A'; 
		char cg2=1;
		System.out.println(cg2);//유니코드가 변환되서 출력이되나
		char cg3=(char)(cg+cg2);//이렇게 더하면 1+A가 되므로 이것을 자동으로 변환하지않아 강제벼환 필요
		int ig2=cg+cg2;//정수형에 CHAR 로 변화된 둘을 넣으면 크기는 맞으므로 유니코드 값으로 변환되어 입력  
		System.out.println("유니코드="+ig2);
		System.out.println("출력문자="+(char)ig2);
		
		int ig3=10;
		int ig4=ig3/4;
		System.out.println(ig4);
		
		int ig5=10;
		double dg=ig5/4.0;//INT 를 실수로 나눔으로서 자동 변환이 되어서 실수형인 더블값이 들어감 
		System.out.println(dg);

	}

}

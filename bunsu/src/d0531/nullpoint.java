package d0531;

public class nullpoint {

	public static void main(String[] args) {
		try{String b = null;
		System.out.println(b.toString());}
		catch(NullPointerException e) {
			System.out.println("널포인트 예외처리했음");
		}
		finally {System.out.println("예외가 뜨든 안뜨든 finally무조건 실행이됩니다. ");}
		
try{int[] a = {1};
		System.out.println(a[3]);
}
catch(ArrayIndexOutOfBoundsException n){
	System.out.println(" 배열오류 예외처리함");
}


	}}

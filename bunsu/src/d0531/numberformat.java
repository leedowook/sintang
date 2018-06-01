package d0531;

public class numberformat {
	public static void main(String[] args) {
		//NumberFormatException
	try {	String data1="100";
		String data2="a200";
		
		int value1=Integer.parseInt(data1);
		int value2=Integer.parseInt(data2);
		System.out.println(value1);
		System.out.println(value2);
		int result=value1+value2;
		System.out.println(data1+" + "+data2+"="+result);}
	catch(NumberFormatException e) {
		System.out.println("안바뀌는거 예외처리했음");
	}
	
	}
}

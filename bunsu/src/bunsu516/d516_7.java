package bunsu516;

public class d516_7 {
	public static void main(String []args) {
		int v2= 1;
		double v3=1.0;
		System.out.println(v2==v3);
		
		double v4=0.1;
		float v5=0.1f;
		System.out.println(v4==v5);
		//false 0.1f의 근사치 실제값 0.100000002232423
		System.out.println((float)v4==v5);
		System.out.println((int)(v4*10)==(int)(v5*10));
		
	}
}

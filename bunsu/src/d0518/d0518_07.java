package d0518;

public class d0518_07 {

	public static void main(String[] args) {
		String[][] c=new String[3][];
		c[0]=new String[2];
		double[][] a=new double[3][5];
		int [][] b=new int[2][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=i+j;
				System.out.println(a[i][j]);
		
			}
			
		}
		
	}

}

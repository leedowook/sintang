package bunsu516;

public class d516_11 {
	public static void main(String[]args) {
		int score =85;
		char g=(score>90)?'A':'B';
		g=((score>97)?'A':((score>80)?'B':'C'));
		System.out.println(g);
	}
}

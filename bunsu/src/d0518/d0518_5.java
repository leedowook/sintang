package d0518;

public class d0518_5 {
	public static void main(String[]args) {
		//배열 선언:int 타입의 scores 라는 배열 변수 선언
		//int[] scores;
		int[] scores= {83,90,87};
		//'[]'이 부분의 숫자가 배열 총 길이=3 index=0~2
		
		//배열값 접근(출력)
		System.out.println("scores[0]="+scores[0]);
		System.out.println("scores[1]="+scores[1]);
		System.out.println("scores[2]="+scores[2]);
		
		//배열 요소들의 합 구하기
		int sum=0;
		int t=0;
		for(int i=0; i<=2;i++) {
			sum+=scores[i];
			t++;
		}
		System.out.println("총합 : "+sum);
		double avg= sum/t;
		System.out.println("평균 : "+avg);
	}
}

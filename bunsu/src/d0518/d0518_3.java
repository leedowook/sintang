package d0518;
import java.util.*;
public class d0518_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner answer=new Scanner(System.in);
		int a,c=(int)(Math.random()*100)+1,i=0;
		while(true) {
			System.out.print("1~100까지 수를 고르시오");
			a=answer.nextInt();
			if(100<a||a<1){//100넘어가거나 1아래 입력했을때
				System.out.println("이상한거 입력하지마세요");
			}
			
			else {//1~100사이일떄
				if(c<a) {//정답이 입력한값보다 작을때
				System.out.println("다운");
				i++;
				}
				else if(c==a) {//정답일때
				System.out.println("축하드립니다"+i+"번 시도에 정답입니다.");
				break;
				
				}
				else{//정답이 입력한 값보다 클때
				i++;
				System.out.println("업");
				}
			}}
	}}

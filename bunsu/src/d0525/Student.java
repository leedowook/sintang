package d0525;
import java.util.*;
public class Student {
	int stu[][]=new int[3][3];
	String name[]=new String[3];
	int sum[]=new int[3],순서[]=new int[3];
	double avg[]=new double[3];
	Scanner scan=new Scanner(System.in);
	public void inf(){
		boolean z=true;
		int i=0;
		while(z) {
			if(i==stu.length) {
				z=false;
				
			}
			else if(i<stu.length){
				
				System.out.print("학생의 이름을 입력하세요");
				this.name[i]=scan.next();
				System.out.print("국어점수를 입력하세요");
				this.stu[i][0]=scan.nextInt();
				System.out.print("수학점수를 입력하세요");
				this.stu[i][1]=scan.nextInt();
				System.out.print("영어점수를 입력하세요");
				this.stu[i][2]=scan.nextInt();
				i++;
				continue;
			}
		}
		
	}
	public void avg() {
		for(int i=0;i<this.stu.length;i++) {
			for(int x=0;x<this.stu[0].length;x++) {
				this.sum[i]+=this.stu[i][x];
			}
			this.avg[i]=(double)this.sum[i]/this.stu[i].length;
			System.out.println(name[i]+"학생의 점수 합계는"+sum[i]+" 평균은"+avg[i]);
		}
		
		
	}
	public void max() {
		int temp,max=this.sum[0];
		
		for(int i=0;i<this.sum.length;i++)
		{순서[i]=sum[i];}
		for(int i=0;i<this.sum.length;i++) {
			if(순서[i]>=max) {
				temp=max;
				max=순서[i];
				순서[i]=temp;
			}
			else {
				continue;
			}
		}
		순서[0]=max;
	}
	public void max출력() {
		int x=0,count=0,i=0;
		boolean v=true;
		while(v) {
			if(순서[i]==sum[x]) {
				System.out.println(i+1+"등은"+name[x]+"으로"+순서[i]+"점입니다.");
				i++;
				x=0;
				count++;
			}
			else if(count==3) {
				v=false;
			}
			else {
				x++;
				continue;
			}
			
		}
	}
	
	
}

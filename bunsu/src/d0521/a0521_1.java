package d0521;

import java.util.Scanner;

public class a0521_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("한계를 정하시오");
		int j=scan.nextInt();
		int[] s=new int[j];
		int i;
		
		System.out.println(j+"개의 값을 입력하세요");
		for(i=0;i<s.length;i++) {
					s[i]=scan.nextInt();
				}
		scan.close();
		int x=1,max=s[0],temp;
		int min=s[0];
		i=1;
		while(x==1) {
			if(i>=s.length){
				System.out.println("제일 큰값은 "+max+"이며 제일 작은 값은"+min+"입니다");
				System.out.println("순서는");
				
				for(int k=0;k<s.length;k++) {
				for(int j1=k+1;j1<s.length;j1++) {
					if(s[k]<s[j1]) {
					temp=s[j1];
					s[j1]=s[k];
					s[k]=temp;
				}
					
					}System.out.println(s[k]);
				}x=2;}		
				
				
			else {
			if(s[i]>max) {
				
				max=s[i];
				i++;
			}
			else{
				
				if(s[i]<min) {
					min=s[i];
				}
				i++;
				continue;
			}
			
		}}}}



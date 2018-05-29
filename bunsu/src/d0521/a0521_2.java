package d0521;

import java.util.Scanner;

public class a0521_2 {

	public static void main(String[] args) {
		Scanner money=new Scanner(System.in);
		int nen,gu,m=1,gab;
		int[] don=new int[6];
		do{ System.out.println("==============================");
			System.out.println("1.힐링포션|2.마나포션|3.행동포션");
			System.out.println("==============================");
			gab=money.nextInt();
			if(gab==1) {
				System.out.println("힐링포션은 4500원입니다 고갱님");
			nen=money.nextInt();
				if(nen<4500) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				else if(nen>4500) {
					gu=nen-4500;
					if(gu!=0) {
						don[0]=gu/5000;
						don[1]=gu%5000/1000;
						
						don[2]=gu%1000/500;
						don[3]=gu%500/100;
						don[4]=gu%100/50;
						don[5]=gu%50/10;
						
						System.out.println("총 거스름돈"+gu+"이며");
						System.out.println("5000:"+don[0]+"개");
						System.out.println("1000:"+don[1]+"개");
						System.out.println("500:"+don[2]+"개");
						System.out.println("100:"+don[3]+"개");
						System.out.println("50:"+don[4]+"개");
						System.out.println("10:"+don[5]+"개입니다.");
						m=2;
						
						break;
						/*for(int i=0;i<don.length;i++;) {
							if(i==0) {
								don[0]=gu/5000;
							}
							else if(i%2==1) {
								don[i]=gu%5*(Mathpow(10,i))
							}
						}*/
						
					}
				}
			}
			else if(gab==2) {
				System.out.println("마나포션은 7500원입니다 고갱님");
				nen=money.nextInt();
					if(nen<7500) {
						System.out.println("잔액이 부족합니다.");
						continue;
					}
					else if(nen>7500) {
						gu=nen-7500;
						if(gu!=0) {
							don[0]=gu/5000;
							don[1]=gu%5000/1000;
							
							don[2]=gu%1000/500;
							don[3]=gu%500/100;
							don[4]=gu%100/50;
							don[5]=gu%50/10;
							System.out.println("총 거스름돈"+gu+"이며");
							System.out.println("5000:"+don[0]+"개");
							System.out.println("1000:"+don[1]+"개");
							System.out.println("500:"+don[2]+"개");
							System.out.println("100:"+don[3]+"개");
							System.out.println("50:"+don[4]+"개");
							System.out.println("10:"+don[5]+"개입니다.");
							m=2;
							
							break;
			}
			
					}}
			else if(gab==3) {
				System.out.println("힐링포션은 3520원입니다 고갱님");
				nen=money.nextInt();
					if(nen<3520) {
						System.out.println("잔액이 부족합니다.");
						continue;
					}
					else if(nen>3520) {
						gu=nen-3520;
						if(gu!=0) {
							don[0]=gu/5000;
							don[1]=gu%5000/1000;
							
							don[2]=gu%1000/500;
							don[3]=gu%500/100;
							don[4]=gu%100/50;
							don[5]=gu%50/10;
							System.out.println("총 거스름돈"+gu+"이며");
							System.out.println("5000:"+don[0]+"개");
							System.out.println("1000:"+don[1]+"개");
							System.out.println("500:"+don[2]+"개");
							System.out.println("100:"+don[3]+"개");
							System.out.println("50:"+don[4]+"개");
							System.out.println("10:"+don[5]+"개입니다.");
							m=2;
							
							break;
			}
					}}
		}while(m==1);

	}
		
		}

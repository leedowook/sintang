package d0518;
import java.util.*;
public class a0518_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num= new Scanner(System.in);
		
		int i=1,sum=0,s=1;
		/*for(;sum<=100;++i) {
			s*=-i;
			
			sum+=(-s);
			
			if(sum<100) {
			System.out.print(s+"+");}
			else if(sum==100) {
				System.out.print(s+"="+sum);
				break;}
			s=s/i;
			
			
			
						}
		
		
	}}*/
	while(true){
		
		s*=i;
		
		sum+=s;
		
		if(sum<100) {
		System.out.print(s+"+");}
		else if(sum==100) {
			System.out.print(s+"="+sum);
			break;}
	
		s=s/-i;
		i++;
		
	}}}
		
		/*
		while(true) {
			sum+=i;	
			if(sum!=100) {
				if(i%2==1) {
					System.out.print(i+"+");}
				else {
				System.out.print("("+-i+")"+"+");}}
			else if(sum==100) {
				if(i%2==1) {
					System.out.println(i+"="+sum);
					break;}
				else {
					System.out.println(-i+"="+sum);
					break;}}
			i++;}}}*/

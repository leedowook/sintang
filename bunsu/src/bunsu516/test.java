package bunsu516;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] n =new String[1];
		int d =scan.nextInt();
		String ll=null;
		if(d==1) {
			ll="a";
		}
		
		if(ll==null) {
			System.out.println("비어있다. ");
		}
		
		
		String a="(ㄴㄴㄴ";
		String b=",ddd";
		String c=a;
		for(int i=1;i<10;i++) {
			c=c+b;
			
			
		}
		System.out.println(c);
	}
	public String number(String number) {
		String endnum=null;
		 int num=Integer.parseInt(number.substring(2));
		 System.out.println(num);
		 String numalpha=number.substring(0,2);
		 String numbeta=number.substring(0,1);
		 System.out.println(numalpha);
		 System.out.println(numbeta);
		 System.out.println(numalpha.substring(1,2));
		 if((num+1)==100){
		 if(numalpha.substring(1,2).equals("a")){
		 		numalpha=numalpha.substring(0,1)+"b";	
		 }
		 else if(numalpha.substring(1,2).equals("b")){
		 		numalpha=numalpha.substring(0,1)+"c"	;
		 }
		 else if(numalpha.substring(1,2).equals("c")){
		 		numalpha=numalpha.substring(0,1)+"d"	;
		 }
		 else  if(numalpha.substring(1,2).equals("d")){
		 		numalpha=numalpha.substring(0,1)+"e"	;
		 }
		 else  if(numalpha.substring(1,2).equals("e")){
		 		numalpha=numalpha.substring(0,1)+"f"	;
		 }
		 else  if(numalpha.substring(1,2).equals("f")){
		 		numalpha=numalpha.substring(0,1)+"g"	;
		 }
		 else if(numalpha.substring(1,2).equals("g")){
		 		numalpha=numalpha.substring(0,1)+"h"	;
		 }
		 else if(numalpha.substring(1,2).equals("h")){
		 		numalpha=numalpha.substring(0,1)+"i"	;
		 }
		 else  if(numalpha.substring(1,2).equals("i")){
		 		numalpha=numalpha.substring(0,1)+"j"	;
		 }
		 else  if(numalpha.substring(1,2).equals("j")){
		 		numalpha=numalpha.substring(0,1)+"k"	;
		 }
		 else if(numalpha.substring(1,2).equals("k")){
		 		numalpha=numalpha.substring(0,1)+"l"	;
		 }
		 else if(numalpha.substring(1,2).equals("l")){
		 		numalpha=numalpha.substring(0,1)+"n"	;
		 }
		 else  if(numalpha.substring(1,2).equals("n")){
		 		numalpha=numalpha.substring(0,1)+"m"	;
		 }
		 else  if(numalpha.substring(1,2).equals("m")){
		 		numalpha=numalpha.substring(0,1)+"o"	;
		 }
		 else  if(numalpha.substring(1,2).equals("o")){
		 		numalpha=numalpha.substring(0,1)+"p"	;
		 }
		 else  if(numalpha.substring(1,2).equals("p")){
		 		numalpha=numalpha.substring(0,1)+"q"	;
		 }
		 else  if(numalpha.substring(1,2).equals("q")){
		 		numalpha=numalpha.substring(0,1)+"r"	;
		 }
		 else if(numalpha.substring(1,2).equals("r")){
		 		numalpha=numalpha.substring(0,1)+"s"	;
		 }
		 else  if(numalpha.substring(1,2).equals("s")){
		 		numalpha=numalpha.substring(0,1)+"t"	;
		 }
		 else if(numalpha.substring(1,2).equals("t")){
		 		numalpha=numalpha.substring(0,1)+"u"	;
		 }
		 else if(numalpha.substring(1,2).equals("u")){
		 		numalpha=numalpha.substring(0,1)+"v"	;
		 }
		 else  if(numalpha.substring(1,2).equals("v")){
		 		numalpha=numalpha.substring(0,1)+"w"	;
		 }
		 else  if(numalpha.substring(1,2).equals("w")){
		 		numalpha=numalpha.substring(0,1)+"x"	;
		 }
		 else if(numalpha.substring(1,2).equals("x")){
		 		numalpha=numalpha.substring(0,1)+"y"	;
		 }
		 else if(numalpha.substring(1,2).equals("y")){
		 		numalpha=numalpha.substring(0,1)+"z"	;
		 }
		 else if(numalpha.substring(1,2).equals("z")){
			 System.out.println("용량초과");
		 }
		 endnum="00";
		 }
		 else{
			 
		 num+=1;
		 if(num<10) {
			 endnum="0"+num;
		 }
		 else {
			 endnum=String.valueOf(num);
		 }
		 }
		
		 number=numalpha+endnum;
		 return number;
}
}
package d0532;

public class sads {
	public void main(String args[]) {
		String exnum=number("ca99","cpu");
		System.out.println(exnum);
	}
	public String number(String number,String part) {
	 if(number==null){
	  number=part+"a00";
	 }
	 else{
	 int num=Integer.parseInt(number.substring(2));
	 String numalpha=number.substring(0,1);
	 if(num+1==10){
	 	
	 if(numalpha.substring(1).equals("a")){
	 		numalpha=numalpha.substring(0,0)+"b";	
	 }
	 if(numalpha.substring(1).equals("b")){
	 		numalpha=numalpha.substring(0,0)+"c"	;
	 }
	 if(numalpha.substring(1).equals("c")){
	 		numalpha=numalpha.substring(0,0)+"d"	;
	 }
	 if(numalpha.substring(1).equals("d")){
	 		numalpha=numalpha.substring(0,0)+"e"	;
	 }
	 if(numalpha.substring(1).equals("e")){
	 		numalpha=numalpha.substring(0,0)+"f"	;
	 }
	 if(numalpha.substring(1).equals("f")){
	 		numalpha=numalpha.substring(0,0)+"g"	;
	 }
	 if(numalpha.substring(1).equals("g")){
	 		numalpha=numalpha.substring(0,0)+"h"	;
	 }
	 if(numalpha.substring(1).equals("h")){
	 		numalpha=numalpha.substring(0,0)+"i"	;
	 }
	 if(numalpha.substring(1).equals("i")){
	 		numalpha=numalpha.substring(0,0)+"j"	;
	 }
	 if(numalpha.substring(1).equals("j")){
	 		numalpha=numalpha.substring(0,0)+"k"	;
	 }
	 if(numalpha.substring(1).equals("k")){
	 		numalpha=numalpha.substring(0,0)+"l"	;
	 }
	 if(numalpha.substring(1).equals("l")){
	 		numalpha=numalpha.substring(0,0)+"n"	;
	 }
	 if(numalpha.substring(1).equals("n")){
	 		numalpha=numalpha.substring(0,0)+"m"	;
	 }
	 if(numalpha.substring(1).equals("m")){
	 		numalpha=numalpha.substring(0,0)+"o"	;
	 }
	 if(numalpha.substring(1).equals("o")){
	 		numalpha=numalpha.substring(0,0)+"p"	;
	 }
	 if(numalpha.substring(1).equals("p")){
	 		numalpha=numalpha.substring(0,0)+"q"	;
	 }
	 if(numalpha.substring(1).equals("q")){
	 		numalpha=numalpha.substring(0,0)+"r"	;
	 }
	 if(numalpha.substring(1).equals("r")){
	 		numalpha=numalpha.substring(0,0)+"s"	;
	 }
	 if(numalpha.substring(1).equals("s")){
	 		numalpha=numalpha.substring(0,0)+"t"	;
	 }
	 if(numalpha.substring(1).equals("t")){
	 		numalpha=numalpha.substring(0,0)+"u"	;
	 }
	 if(numalpha.substring(1).equals("u")){
	 		numalpha=numalpha.substring(0,0)+"v"	;
	 }
	 if(numalpha.substring(1).equals("v")){
	 		numalpha=numalpha.substring(0,0)+"w"	;
	 }
	 if(numalpha.substring(1).equals("w")){
	 		numalpha=numalpha.substring(0,0)+"x"	;
	 }
	 if(numalpha.substring(1).equals("x")){
	 		numalpha=numalpha.substring(0,0)+"y"	;
	 }
	 if(numalpha.substring(1).equals("y")){
	 		numalpha=numalpha.substring(0,0)+"z"	;
	 }
	 if(numalpha.substring(1).equals("z")){
		 
	 }
	 number=numalpha+num;
	 	


	 }
	 else{
	 num+=1;
	 }
	
	 }
	 return number;
}}



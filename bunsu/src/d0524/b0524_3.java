package d0524;
import java.util.*;
public class b0524_3 {
	Scanner scan=new Scanner(System.in);
	private String name,점수;
	private double asscore,exscore;
	private double sum;
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;//private 걸린건 set으로 호출해줘야함  안그럼못해
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String get점수() {
		return 점수;
	}
	public void set점수(String 점수) {
		this.점수 = 점수;
	}
	public double getAsscore() {
		return asscore;
	}
	public void setAsscore(double asscore) {
		this.asscore = asscore;
	}
	public double getExscore() {
		return exscore;
	}
	public void setExscore(double exscore) {
		this.exscore = exscore;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double 점수반영() {
		System.out.print("이름을 입력하세요: "); 
		name=scan.next();
		System.out.print("과제점수를 입력하세요: "); 
		asscore=scan.nextDouble();
		System.out.print("시험점수를 입력하세요: ");
		 exscore=scan.nextDouble();
		
		
		if(asscore>95&&exscore>95) {
			this.sum=4.5;
		}
		else {
		if( asscore>90) {
			this.sum+=2;
		}
		else if(asscore>80) {
			this.sum+=1.5;
		}
		else if(asscore>60) {
			this.sum+=1.0;
		}
		else {
			this.sum+=0.5;
		}
		if( exscore>90) {
			this.sum+=2;
		}
		else if(exscore>80) {
			this.sum+=1.5;
		}
		else if(exscore>60) {
			this.sum+=1.0;
		}
		else {
			this.sum+=0.5;
		}}
		return sum;
		
	}
	public String 학점(double x) {
		x=this.sum;
		if(x>4.0) {
			this.점수="A+";
			}
		else if(x>3.8) {
			this.점수="A";
		}
		else if(x>3.5) {
			this.점수="B+";
		}
		else if(x>3.3) {
			this.점수="B";
		}
		else if(x>3.0) {
			this.점수="C+";
		}
		else if(x>2.7) {
			this.점수="C";
		}
		else if(x>2.5) {
			this.점수="D+";
		}
		else if(x>2.0) {
			this.점수="D";
		}
		else {
			this.점수="f";
		}
		return 점수;
	}
	void 정보() {
		System.out.println("이름: "+name);
		System.out.println("시험점수: "+asscore);
		System.out.println("과제점수: "+exscore);
		System.out.println("학점: "+점수+" "+sum);
		
		
		
	}

	
}

package d0523;
//생성자 (constructor) overloading 예제
public class a0523_4 {
	//여러 종류의 생성자 선언해보기
	//field 선언
	String com="현대자동차";
	String mod;
	String col;
	int maxspeed;
	
	
	/* 1. 기본생성자
	 * 2.model을 매개변수로 하는 생성자
	 * 3.model,color을 매개변수로 하는 생성자
	 * 4.model,color,maxspeed를 매개변수로 하는 생성자
	 * */
	public a0523_4() {}
	
	public a0523_4(String mod){
		this(mod,"은색",500);//위에서 부터값이 입력안된  순서로 들어감 
	}
	public a0523_4(String mod,String col){
		this.mod=mod;
		this.col=col;
	}
	public a0523_4(String mod,String col,int maxspeed){
		this.mod=mod;
		this.col=col;
		this.maxspeed=maxspeed;
	}
}

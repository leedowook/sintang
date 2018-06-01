package d0531;

public abstract class countable {
	protected String name;
	protected int num;
	countable(String name,int num){
		this.name=name;
		this.num=num;
	}
	abstract void count();

}

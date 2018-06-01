package d0531;

public class tree extends countable {
	
	tree(String name,int num){super(name,num);}


	@Override 
	public void count() {
		
		System.out.println(name+"나무가 "+num+"그루");
	}
	public void ripen() {
		System.out.println(name+"나무"+num+"그루가 쑥쑥쑥");
		
	}
	
}

package d0531;
import java.util.*;
public class arraylistex {
	public static void main(String[] args) {
		//arraylist선언
		List<String> list=new ArrayList<String>();
		//<>:제네릭(generic)(번거로운 타입변환을 제거해주는 역활)
		/*
		 * List list=new ArrayList();
		 * list.add("홍길동");
		 * Object obj=list get(0);*///object는 데이터를 담을수있는 최상위클래스..
		list.add("홍길동");
		String name=list.get(0);
		System.out.println(name);
	}
}

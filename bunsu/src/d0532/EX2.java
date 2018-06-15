package d0532;
import java.io.*;
import java.util.*;
public class EX2 {
	public static void main(String[] args) {
		List list=new ArrayList();
		//list 객체에 데이터를 저자하는 메소드 add()
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("myBatis");
		
		int size=list.size();
		System.out.println("list의 크기"+size);
		System.out.println();
		
		String skill=(String)list.get(2);
		System.out.println("2번 인덱에 담긴데이터");
		System.out.println();
		//list에 담긴거 출력
		for(int i=0;i<list.size();i++) {
			String str=(String) list.get(i);
			System.out.println(str);
		}
		//list에담긴 데이터 삭제
		list.remove(2);//Database삭제
		list.remove(2);//Servlet/jap삭제됨
		list.remove("JDBC");
		for(int i=0;i<list.size();i++) {
			String str=(String) list.get(i);
			System.out.println(str);
		}
		
	}
}

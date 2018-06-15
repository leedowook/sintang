package d0532;
import java.util.*;
public class hashsetex {
	public static void main(String[] args) {
		Set<String> set= new HashSet<String>();
		set.add("java");
		set.add("JDBC");
		set.add("Sevlet/JSP");//set은 중복된 ㅏㄱㅄ이 들어오게되면 1개로 처리함
		
		
		int size=set.size();
		System.out.println("set 에담긴 총데이터수 "+size);
		//set에 들어있는 모든 데이터 ㅅ가져오기
		//반복자(Iterator)사용
		Iterator<String> iterator=set.iterator();
		//문자열 타입으로 선언
		while(iterator.hasNext())//iterator 안에서 계속 다음에 뭐가있는지 물어봄
		{String element=iterator.next();//iterator안에 들어간걸 넣어줌 ? 순서대로?
		System.out.println(element);
		}
		set.remove("JDBC");
		
		
		set.clear();//set 내용 전체삭제
		set.isEmpty();//set이 비었는지?
		
		
	}
}

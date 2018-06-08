package d0532;

import java.util.*;

public class vectorex {
	public static void main(String[] args) {
		List<board> list=new Vector<board>();
		list.add(new board("제목1","글내용","사용자1"));
		list.add(new board("제목2","글내용","사용자2"));
		list.add(new board("제목3","글내용","사용자3"));
		list.add(new board("제목4","글내용","사용자4"));
		list.add(new board("제목5","글내용","사용자5"));
		
		
		for(int i=0;i<list.size();i++) {
			board bor=list.get(i);
			System.out.println(bor.subject);
			System.out.println(bor.content);
			System.out.println(bor.writer);
	}
	}
}

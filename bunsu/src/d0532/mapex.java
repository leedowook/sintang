package d0532;

import java.util.*;

public class mapex {
	public static void main(String[] args) {
		Map<String,Integer>map =new HashMap<String,Integer>();
		
		map.put("학생1", 18);//앞에오는게 키값임
		map.put("학생2", 100);
		map.put("학생3", 60);
		map.put("학생4", 50);
		map.put("학생5", 20);
		System.out.println("Map에 저장한 데이터수: "+map.size());
		
		System.out.println(map.get("학생1"));//인덱스 번호가 없어서 키값을 입력 get에
		Set<String> keySet=map.keySet();
		Iterator<String> keyi = keySet.iterator();
		while(keyi.hasNext()) {
			String key=keyi.next();
			Integer value=map.get(key);
			System.out.println(key+":"+value);
		}
		
	}
}

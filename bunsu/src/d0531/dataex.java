package d0531;
import java.text.SimpleDateFormat;
import java.util.*;
public class dataex {

	public static void main(String[] args) {
		Date now=new Date();
		String now1=now.toString();
		System.out.println(now);
		System.out.println(now1);
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초") ;
		String now2=sdf.format(now);
		System.out.println(now2);
	}

}

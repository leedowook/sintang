package d0532;
import java.io.*;
import java.util.Scanner;
public class fileclass03 {
	public static void main(String[]args) {
		//스캐너 콘솔창에 입력한 내용을 그대로 파일에 저장화기
		System.out.println("파일 쓰기 연습");
		System.out.println("저장할 파일명:");
		Scanner scan=new Scanner(System.in);
		String fn=scan.next();
		System.out.println("저장을 위해서는 마지막 라인에 q를 입력하세요");
		
		try {
			String path="D:\\test"+fn;
			BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter w=new BufferedWriter(new FileWriter(path));
			String s;
			while(!(s=r.readLine()).equals("q")) {
				w.write(s+"\r\n");//q가 들어오기전까지 무한반복
			}
			r.close();
			w.close();
			scan.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		System.out.println(fn+"저장완료");
		
	}
}

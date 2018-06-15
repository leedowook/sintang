package d0532;
import java.io.*;
public class fileclass {

	public static void main(String[] args) {
		//파일을 생성하고 내용을 쓰기
		String path="D:\\test\\testfile.txt";
		//파일 객체 만들기 java.io.File 의 File
		File file=new File(path);
		
		try {
			//FileWriter java.io.FileWriter  에 FileWriter클래스 선언
			FileWriter fw=new FileWriter(file);
			for(int i='A';i<='Z';i++) {
				fw.write(i);
			}
			fw.close();
			System.out.println("쓰기완료..");
		}
		catch(IOException e) {//예외선언
			e.printStackTrace();
		}
	}
	

}

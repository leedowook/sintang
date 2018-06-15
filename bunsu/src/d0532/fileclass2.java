package d0532;
import java.io.*;
public class fileclass2 {

	public static void main(String[] args) {
		//기존파일을 새로운 파일로 저장
		File r=new File("D:\\test\\testfile.txt");
		//새롭게 만드 파일에대한 객체 생성
		File w=new File("D:\\test\\testfile_new.txt");
		
		try {
			//기존 파일에 읽어오기윟ㄴ reader객체생성
			BufferedReader rd=new BufferedReader(new FileReader(r));
			//읽어온 내용을 쓰기위하 writer객체생성
			BufferedWriter wt=new BufferedWriter(new FileWriter(w));
			
			String s;
			//기존의 파일을 읽어서 s에 저장
			while((s=rd.readLine()) !=null){
				wt.write(s+"새로쓰여진 파일");//s기본내용+새로쓰여진파일
			}
			rd.close();
			wt.close();
			r.delete();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("새로쓰기 완료");
	}

}

package d0531;

public class countmain {
	public static void main(String[] args) {
		
		countable[] a= {new bird("짭",2),new bird("참",3),new tree("사과",4),new tree("밤꽃",5)};
		
		for(countable e: a) { //포이치
			e.count();
			/*
			 *첫번째 반복문 e=m[0]
			 *			 =new bird("짭")
			 *뻐꾸기를 매개변수로 하는 bird의 객체를 생성해서 e에 대입 */
						
			
		}
		for(int i=0;i<a.length;i++) {//조건문을 이용해서 배열에 저장된 각요소가 bird클래스 타입인지 확인
			if(a[i] instanceof bird) {
				((bird) a[i]).fly();
			}
			else{
				((tree) a[i]).ripen();
			}
			
		}
				
			
		}
}

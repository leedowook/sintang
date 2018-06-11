package project01;

import java.io.*;
import java.util.*;

public class ticket {
   Scanner scan = new Scanner(System.in);
   int num, people=0;
   int qq;
   
   //표값 정보를 위한 배열
   cost[] right = new morning[3];
   cost[] dark = new afternoon[3];
   
   //표 구매를 위한 장바구니 배열
   ArrayList<cost> cal = new ArrayList<cost>();
   
   public void reservation1() { 
       morning mr = new morning("대인", 54000);
       right[0] = mr;   //주간이용권을 right 배열에 등록
       mr = new morning("청소년", 46000);
       right[1] = mr;
       mr = new morning("소인/경로", 43000);
       right[2] = mr;
       
       afternoon af = new afternoon("대인", 45000);
       dark[0] = af;   //야간이용권을 dark 배열에 등록
       af = new afternoon("청소년", 39000);
       dark[1] = af;
       af = new afternoon("소인/경로", 36000);
       dark[2] = af;
   }
   
   /*public void reservation2() { //야간이용권을 dark 배열에 등록하고 메인에서 실행
      afternoon af = new afternoon("대인", 45000);
      dark[0] = af;
      af = new afternoon("청소년", 39000);
      dark[1] = af;
      af = new afternoon("소인/경로", 36000);
      dark[2] = af;
   }*/
      
   public void start() {
      System.out.println("가격조회를 원하시면 1번");
      System.out.println("표를 예매하시려면 2번");
      System.out.println("주차장을 현황을 보실려면 9번");
      System.out.println("메인 메뉴로 돌아가려면 0번을 눌러주세요.");
      System.out.print("선택 > ");
      num = scan.nextInt();
      System.out.println();
      select1();
   }

   public void select1() {
      if(num == 1) {
         System.out.println("주간권");
         for(cost c : right) {
            c.reservation();
         }
         System.out.println();
         System.out.println("야간권");
         for(cost c : dark) {
            c.reservation();
         } 
         System.out.println();
         start();
      }
      else if (num==2) {
         System.out.println("당일티켓은 1번");
         System.out.println("티켓을 예약하시려면 2번을 눌러주세요.");
         System.out.print("선택 > ");
         num = scan.nextInt();
         System.out.println();
         select2();
      } else if(num==9){
         parking();
      } else if(num==0) {
         
      }   else {
         System.out.println("잘못된 입력입니다.\n다시 입력해주세요.");
         start();
      }
   }
   
   public void select2() {
      if(num == 1) {
         System.out.println("주간권은 1번");
         System.out.println("야간권은 2번을 눌러주세요.");
         System.out.print("선택 > ");
         num = scan.nextInt();
         System.out.println();
         select3();
      } else if(num==2){
         System.out.println("원하시는 날짜를 입력해주세요.");
         System.out.println("ex) 180612");
         System.out.print("입력 > ");
         String day = scan.next();
         System.out.println("예약이 완료되었습니다. 감사합니다.");
      } 
   }
   
   public void select3() {

      if(num == 1) {
         System.out.println("주간권");
         int i = 0;
         for(cost c : right) {//주간권 티켓 조회
            System.out.print("["+ i + "]");
            c.reservation();
            i++;
         }
         System.out.println("[c]계산");
         System.out.print("선택 > ");
         String sel = scan.next();
         System.out.println();
         
         switch(sel) {
         case "c":
            qq=people;
            people=0;
            checkout1();
            break;
         default :
            int asel = Integer.parseInt(sel);
            cal.add(right[asel]);
            people+=1;//놀이동산에 입장하는 인원수 증가
            select3();
            break;
         }
      } else if(num==2){//야간권 티켓 조회
         System.out.println("야간권");
         int i = 0;
         for(cost c : dark) {
            System.out.print("["+ i + "]");
            c.reservation();
            i++;
         }
         System.out.println("[c]계산");
         System.out.print("선택 > ");
         String sel = scan.next();
         System.out.println();
         
         switch(sel) {
         case "c":
            qq=people;
            people=0;
            checkout1();
         default :
            int asel = Integer.parseInt(sel);
            cal.add(dark[asel]);
            people+=1;
            select3();
         }
      } else {
         System.out.println("잘못된 입력입니다.\n다시입력해주세요.");
         select2();
      }
   }
   
   public void checkout1() { //결제를 위한 메소드
      int total = 0;
      for (cost c : cal) {
         //System.out.println(c.name + " " + c.cost + "원");
         total = total + c.cost;   
      }
      System.out.println("입장권을 구매한 사람은 " + qq + "명 입니다.");
      System.out.println("합계 : " + total + "원 입니다.");
      System.out.println("");
      PopulationDensity();
      System.out.println("");
      
      System.out.println("[q]는 종료, [s]는 결제완료 및 메인메뉴로 돌아갑니다.");
      System.out.print("선택 > ");
      String sel = scan.next();
      
      switch(sel) {
      case "q":
         System.out.println("시스템을 종료합니다.");
         System.exit(0);
         break;
      case "s":
         System.out.println("결제가 완료되었습니다. 감사합니다.");
         System.out.println("");
         start();
      }   
   }
   
   public void popinfo() {
	   try {
	         String path = "D://z.txt" ;
	         BufferedReader reader = new BufferedReader(new FileReader(path));
	         
	         int num;
	         
	         
	         
	         String a;
	         a=reader.readLine();
	         num=Integer.parseInt(a);
	         
	         a=String.valueOf(num);
	         int total =  num;
	         System.out.println("현재 놀이동산의 총 인구수는 " + total + "명 입니다.");
	         System.out.println("");
	         BufferedWriter writer = new BufferedWriter(new FileWriter(path));
	            writer.write(a);
	            
	         if(total>30) {
	            System.out.println("인구 밀도가 포화상태입니다.");
	         } else if(total>20) {
	            System.out.println("인구 밀도가 많습니다.");
	         } else if(total>10) {
	            System.out.println("인구 밀도가 보통입니다.");
	         } else {
	            System.out.println("인구 밀도가 원활입니다.");
	         }

	         reader.close();
	         writer.close();
	         
	   }  catch(Exception e) {
		      e.printStackTrace();
	   }
   }
   
   
   public void PopulationDensity(){
      //Scanner scanner = new Scanner(System.in);
      
      try {
         String path = "D://z.txt" ;
         BufferedReader reader = new BufferedReader(new FileReader(path));
         
         int num;
         
         int ingu=qq;
         
         String a;
         a=reader.readLine();
         num=Integer.parseInt(a);
         num+=ingu;
         a=String.valueOf(num);
         int total = people + num;
         System.out.println("현재 놀이동산의 총 인구수는 " + total + "명 입니다.");
         System.out.println("");
         BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write(a);
            
         if(total>30) {
            System.out.println("인구 밀도가 포화상태입니다.");
         } else if(total>20) {
            System.out.println("인구 밀도가 많습니다.");
         } else if(total>10) {
            System.out.println("인구 밀도가 보통입니다.");
         } else {
            System.out.println("인구 밀도가 원활입니다.");
         }

         reader.close();
         writer.close();
         
         }
    catch(Exception e) {
      e.printStackTrace();
   }
   }
   

   public void parking() {

         Scanner scanner = new Scanner(System.in);
         boolean run = true;
         
         
         while(run) {
            System.out.println("--------------------------------------");
            System.out.println("A구역 주차장 | B구역 주차장 | C구역 주차장 | ");
            System.out.println("종료하시려면 아무키나 누르시오");
            System.out.println("--------------------------------------");
            System.out.print("선택해주세요. > ");
            
            String parkingzone = scanner.next();
            
            if(parkingzone.equals("a")) {
               System.out.println("A구역 주차장을 선택하셨습니다.");
               int totalcipher = 100;
               System.out.println("A구역 주차장의 전체 주차수는 " + totalcipher + " 입니다.");
               int car = (int) (Math.random()*100) + 1;
               System.out.println("현재 남아있는 A구역 주차장의 주차공간은 " + (totalcipher - car) + "입니다.");
               if((totalcipher-car)==0) {
                  System.out.println("남아 있는 자리가 없습니다.");
               }   
            } else if(parkingzone.equals("b")) {
               System.out.println("B구역 주차장을 선택하셨습니다.");
               int totalcipher = 80;
               System.out.println("B구역 주차장의 전체 주차수는 " + totalcipher + " 입니다.");
               int car = (int) (Math.random()*80) + 1;
               System.out.println("현재 남아있는 B구역 주차장의 주차공간은 " + (totalcipher - car) + " 입니다.");
               if(totalcipher<car) {
                  System.out.println("남아 있는 자리가 없습니다.");
               }
            } else if(parkingzone.equals("c")) {
               System.out.println("C구역 주차장을 선택하셨습니다.");
               int totalcipher = 150;
               System.out.println("C구역 주차장의 전체 주차수는 " + totalcipher + " 입니다.");
               int car = (int) (Math.random()*150) + 1;
               System.out.println("현재 남아있는 C구역 주차장의 주차공간은 " + (totalcipher - car) + " 입니다.");
               if(totalcipher<car) {
                  System.out.println("남아 있는 자리가 없습니다.");
               }
            } else {
               run = false;
               break;
            }
         }
      }

   }

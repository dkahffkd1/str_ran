package ran;

import java.util.Random;

public class Random1 {
 public static void main(String[] args) {
	
	 Random r = new Random();
		for(int i=0; i<5 ; i++) {
			int num = r.nextInt(6)+ 1;//(범위) + (시작 점)으로 계산하면 편함
									 // ex) 6,7을 뽑으려면 (2) <- 2개니까 (2) + 6<- 6이 시작점
									 // 뒤에 +1을 하면 1~10까지의 값을 뽑음 원래는(10)을 넣었을 때 0~9
			System.out.println(num);// ex) 주사위 1~6을 뽑으려면  6까지 뽑아야 하니 (6) , 1~6까지 시작점이 1이니까 +1

		}
		System.out.println();
		for ( int j = 0; j<6; j++) {
			int num1 = r.nextInt(45)+1;
			System.out.println(num1);
		}
		System.out.println();
		for ( int k=0; k<5; k++) {
			double dou = Math.random()*30;// *3 <- 범위 설정 
			System.out.println((int)dou);//(int)= 정수화
		}
	}
	}
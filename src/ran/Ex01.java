package ran;

import java.util.Random;//Random 변수 = new Random(); 을 쓸려면 넣어줘야 함 Random+ ctrl space

public class Ex01 {
	public static void main(String[] args) {
		for(int i =0; i<5 ; i++) {
			System.out.println( Math.random()); // Math 자체가 0.001~2.999까지의 값만 출력 가능 그래서 double을 사용
		}
		System.out.println("-----------");
		for(int i =0; i<5 ; i++) {
			double dou = Math.random() *3 ; // int로 형 변환 하고 싶으면 int dou = (int)(Math.random() *3)을 해주면 int로 변형됌
		System.out.println( (int)dou); // (int) = int로 형 변환
		}
		System.out.println("====================");
		Random r = new Random();
		for(int i=0; i<5 ; i++) {
			int num = r.nextInt(3); //0~2
			System.out.println(num);
		}
}
}
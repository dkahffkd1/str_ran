package string;

public class ex03 {
public static void main(String[] args) {
	String str = "test   ";
	System.out.println("str : "+ str);
	System.out.println( str.equals("test"));
	String result = str.trim();
	System.out.println("result :" + result);
	System.out.println(result.equals("test"));
	
	String addr = "05214/노원구/동일로4567";
	System.out.println(addr);
	String[] split = addr.split("/");
	for(int i=0; i<split.length ; i++) {
		System.out.println(i+"."+split[i]);
	}

	
	String phone = "010-1234-1234";
	String rep = phone.replace("-","a");
	System.out.println("rep : "+rep);// 문자와 숫자가 더해지면 문자로 변경 됌
	
	phone = "1234";
	int num = Integer.parseInt(phone);//문자열 형태의 숫자를 숫자로 변경해주는 방법
	System.out.println(num + 100);// parseInt가 없으면 1234100으로 출력
	
	String s = num + "";// 숫자를 다시 문자로 변경하는 방법
	System.out.println(s+100);

	
}
}

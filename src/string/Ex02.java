package string;

public class Ex02 {
	public static void main(String[] args) {
		String str = "test";
		System.out.println("length : " +str.length());
		System.out.println("charAt(1)" + str.charAt(1));
		System.out.println(str.charAt(0) == 't');
		System.out.println(str.charAt(0) != 't');
		System.out.println(str.equals("aaaa"));
		String jumin = "90aa14";
		/*if(jumin.length() == 6) {
			for(int i = 0; i<jumin.length(); i++) {
				if(jumin.charAt(i)< '0' || jumin.charAt(i) > '9') {
					System.out.println("숫자를 입력 하세요");
					break;
				}
			}
		}else {
			System.out.println("길이가 잘못 됐음!!");
		}
		 
		 */
		if(jumin.length()==6) {
			int i=0;
			for(;i<6;i++) {
				if(jumin.charAt(i)<'0' || jumin.charAt(i)>'9'){
					System.out.println("숫자를 입력하세요");
					break;
				}
		}
		if(i==6) {
			System.out.println("뒷자리 주민번호 입력");
		}else{
	 System.out.println("잘못 만듦");
		}
		}
		System.out.println("----------------");
		int i=0;
		for(;i<5;i++) {
			if(i==4) break;
		}
		System.out.println("i : " +i);
	}
}

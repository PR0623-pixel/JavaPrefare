package Ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		//int charCode = 'a';
		//int charCode = '5';
		
		if( (65<=charCode) & (charCode <= 90)) {
			System.out.println("대문자"); // 대문자 A값 ~ Z값 ASCII 코드 사잇값
		}
		
		if( (97<=charCode) && (charCode <= 122)) {
			System.out.println("소문자"); // 소문자 a값 ~z값 ASCII 코드 사잇값
		}
		
		if( (48 <= charCode) && (charCode <= 57)) {
			System.out.println("0~9 숫자"); //0 ~ 9 ASCII 코드 사잇값.
		}
		
		//-------------------------------------------------------------
		
		int value = 6;
		//int value = 7;
		
		if ((value%2==0) | (value%3 == 0)) {
			System.out.println("2 or 3의 배수.");
		}
		
		boolean result = (value%2 == 0) || (value%3 == 0);
		if (!result) {
			System.out.println("2 or 3의 배수 아님.");
		}
		

	}

}

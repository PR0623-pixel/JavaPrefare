package Ch03.sec02;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2; //모든 연산은 int 타입으로 자동 변환 후 연산 
		System.out.println("result 1 : " + result1);
		
		long result2 = v1 + v2;
		System.out.println("result 2 : " + result2); //long으로 자동 변환 후 연산

		double result3 = (double) v1 / (double) v2; //double(실수이므로)은 강제 변환해주어야함.
		System.out.println("result 3 : " + result3);
		
		int result4 = v1 % v2;
		System.out.println("result 4 : " + result4);
	}

}

package Ch03.sec09;

public class BitShiftExample1 {

	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3; // num1의 비트를 좌측으로 3칸. 00000001 -> 00001000
		int result2 = num1 * (int) Math.pow(2, 3); //2의 3승과 곱한다.
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		int num2 = -8;
		int result3 = num2 >> 3; // num2의 bit를 3칸 우측으로. 이때 부호는 움직이지 않는다.
		int result4 = num2 / (int) Math.pow(2,  3); // 2의 3승과 나눈다.
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
	}

}

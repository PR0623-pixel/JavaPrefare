package Ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		System.out.println("사과 1개에서 남은 양 : " + result);
		// 정확한 연산을 위해선 double 같은 실수타입을 지양하는것이
		// 좀 더 정확한 연산이 된다.
		// IEEE 754를 검색해보면 정확한 이해를 할 수 있다.
		

	}

}

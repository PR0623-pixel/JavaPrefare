package Ch04.sec04;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}	// i-1인 이유는 마지막 반복에서, 나중에 1을 더했기 때문에.

}

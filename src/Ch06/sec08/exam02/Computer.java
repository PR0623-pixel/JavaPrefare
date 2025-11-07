package Ch06.sec08.exam02;

public class Computer {
	//가변길이 매개변수를 가지는 메소드 선언
	int sum(int ...values) {
		int sum = 0;
		
		//values를 배열 타입처럼 응용해서 길이만큼 반복.
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
}

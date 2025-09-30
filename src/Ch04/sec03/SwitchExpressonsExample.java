package Ch04.sec03;

public class SwitchExpressonsExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A', 'a' -> { //복수의 케이스를 한번에 표현 가능.
				System.out.println("우수 회원");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원");
			}
			default -> {
				System.out.println("손님");
			}
		}
		
		switch(grade) {	//간단한 명령의 경우 칸을 열지 않고 표현 가능.
			case 'A', 'a' -> System.out.println("우수 회원");
			case 'B', 'b' -> System.out.println("일반 회원");
			default -> System.out.println("손님");
		}

	}

}

package Ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1; //Math 함수로 랜덤 값 지정.
		
		switch(num) { // num 값에 따라 각 case 실행.
			case 1:
				System.out.println("1번이 나왔습니다.");
				break; // 지정해주지 않으면 순환하므로. break 걸어줌.
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default: //기본 값으로 6일때를 설정.
				System.out.println("6번이 나왔습니다.");
		}	

	}

}

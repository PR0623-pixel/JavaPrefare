package Ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		String grade = "B";
		
		//Java 12 이전 문법
		int score1 = 0;
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		System.out.println("score1 : " + score1);
		
		//Java 12부터는..
		int score2 = switch(grade) { //변수 값에 switch문 도입 가능.
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				//Java 13부터 가능.
				yield result; // case "B" 일때, result 반환.
			}					//return과 사용 방법이 유사함.
			default -> 60;
		}; // 변수에서 불러내었으므로 괄호 뒤 ; 표기.
		System.out.println("score2 : " + score2);
	}

}

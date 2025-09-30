package Ch04.sec03;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8; // 0~3까지의 랜덤갑ㄳ 제시 한 후 8 더함.
		System.out.println("[현재시간 : " + time + " 시]");
		
		switch(time) { //Random으로 제시한 time값에 따라 실행.
		case 8:	//Break를 걸지 않았으므로, 10이하의 숫자가 발생한 경우
			System.out.println("출근"); // 각 케이스가 실행됨.
		case 9:
			System.out.println("회의 시작.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		

	}

}

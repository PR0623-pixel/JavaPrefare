package Ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scaaner 값 받기.
		boolean run = true; //run 값을 일단 While문 돌도록 True로 설정
		int speed = 0;

		while(run) {
			System.out.println("---------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 즁자");
			System.out.println("---------------------------");
			System.out.print("선택");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("3")) {
				run = false;
				//break로도 가능.
			}
		}
		
		System.out.println("프로그램 종료");
	}

}

package Ch04.sec05;

import java.util.Scanner;

public class KeyControlAssignment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		
		while(run){
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.println("선택 > ");
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				System.out.println("예금액 >");
				int strMoney1 = scanner1.nextInt();
				money += strMoney1;
			} else if(strNum.equals("2")) {
				System.out.println("출급액 >");
				int strMoney2 = scanner1.nextInt();
				if(strMoney2 > money) {
					System.out.println("출금액이 예끔액 보다 큽니다.");
					continue;
				} else {
				money -= strMoney2;
				}
				
			} else if (strNum.equals("3")) {
				System.out.println("잔고 > ");
				System.out.println(money);
			} else if (strNum.equals("4")) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
		
	}

}

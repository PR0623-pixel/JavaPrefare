package Ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력 : ");
		String strX = scanner.nextLine(); //nextLine은 input, scan과 같다.
		int x = Integer.parseInt(strX); //입력 받은 값은 str값이므로 int로 변환해서 출력
		
		System.out.print("y 값 입력 : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y : " + result);
		System.out.println();
		
		while(true) {
			System.out.print("입력 문자열 : ");
			String data = scanner.nextLine(); //문자열을 입력받았고, 문자열로 출력을 해야하므로 변환 X
			if(data.equals("q")) { //q 입력시 break 하여 탈출
				break;
			}
			System.out.println("출력 문자열 : " + data);
			System.out.println();
			
			
		}
		
		System.out.println("종료");
	}

}

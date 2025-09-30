package Ch04.sec07;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num==6) { //num 6일때 break. 
				break;	//하지만 이외에 break 없으므로 6 나올때까지 반복.
			}
		}
		System.out.println("프로그램 종료");
	}

}

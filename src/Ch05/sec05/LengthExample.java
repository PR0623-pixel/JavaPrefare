package Ch05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		String ssn = "0302201940380";
		int leng = ssn.length();
		if(leng == 13) {
			System.out.println("주민번호 자리수 일치");
		} else {
			System.out.println("주민번호 자리수 불일치");
		}

	}

}

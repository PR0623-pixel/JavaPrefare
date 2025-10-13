package Ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		String ssn = "0106241230123";
		char sex = ssn.charAt(6);
		switch (sex) {
			case '1':
				System.out.println("1900년대생 남자");
				break;
			case '3':
				System.out.println("2000년대생 남자");
				break;
				
			case '2':
				System.out.println("1900년대생 여자");
				break;
			case '4':
				System.out.println("2000년대생 여자");
				break;
		}

	}

}

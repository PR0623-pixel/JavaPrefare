package Ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "990321-1020304";
		
		String firstnum = ssn.substring(0, 6);
		System.out.println(firstnum);
		
		String secondnum = ssn.substring(7);
		System.out.println(secondnum);

	}

}

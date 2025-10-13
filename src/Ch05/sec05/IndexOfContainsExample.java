package Ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "객체지향 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); // 불러온 값의 위치.
		System.out.println(location);
		String substring = subject.substring(location); // location에 저장된 값을 substring 함.
		System.out.println(substring);
		
		location = subject.indexOf("객체지향");
		if(location != -1) {
			System.out.println("객체지향 언어와 관련된 책");
		} else {
			System.out.println("객체지향 언어와 관련없는 책");
		}
		
		boolean result = subject.contains("객체지향");
		if(result) {
			System.out.println("객체지향 관련된 책, "+ result);
		} else {
			System.out.println("객체지향 관련없는 책, "+ result);
		}

	}

}

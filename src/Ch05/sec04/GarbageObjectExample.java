package Ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; //여행 갹체를 garbage화.
		
		String kind1 = "자동차"; //자동차 객체 주소값 저장.
		String kind2 = kind1;  // kind1의 주소를 인계받음.
		kind1 = null; //자동차 객체와의 연결제거, 하지만 garbage가 되지 않는다.
		System.out.println("kind2 : "+ kind2);
	}

}

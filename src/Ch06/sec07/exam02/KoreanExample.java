package Ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바","031107-3234321");
		
		System.out.println("k1.nation : "+ k1.nation);
		System.out.println("k1.name : "+k1.name);
		System.out.println("k1.ssn : "+k1.ssn);
		System.out.println();
		
		//다른 korean 객체
		Korean k2 = new Korean("김자바","020220-4857423");
		
		System.out.println("k2.nation : "+k2.nation);
		System.out.println("k2.name : "+k2.name);
		System.out.println("k2.ssn : "+k2.ssn);
		System.out.println();

	}

}

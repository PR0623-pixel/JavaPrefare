package Ch06.sec07.exam04;

public class Car {
	String company = "기아자동차";
	String model;
	String color;
	int maxspeed;
	
	//생성자를 별개로 선언
	Car(){}
	
	//각각의 경우에 대해 입력 받을 경우.. (생성자 오버로딩)
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}

package Ch06.sec07.exam05;

public class Car {
	//필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	Car(String model){
		//20라인 생성자
		this(model, "은색", 250);
	}
	
	Car(String model, String color){
		this(model,color,250);
	}
	
	Car(String model, String color, int maxspeed){
		this.model= model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}

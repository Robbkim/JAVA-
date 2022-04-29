package clazz.constructor;

class Car2 {
	
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 기본생성자
	public Car2() {}
	
	// 생성자 오버로딩
	public Car2(String model) {
		this.model = model;
	}
	
	public Car2(String model, String color) {
		this.model = model;
		this.color = color;
		
	}
	
	public Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
    }

}

public class Ex02 {

	public static void main(String[] args) {
		
		Car2 car1 = new Car2(); // 기본생성자 호출 매개변수가 없음
		
		Car2 car2 = new Car2("아반떼");
		Car2 car3 = new Car2("소나타", "빨강");
		Car2 car4 = new Car2("그랜져", "검정", 300);
		
		
		System.out.println("제작회사 : " + car4.company);
		System.out.println("모델 : " + car4.model);
		System.out.println("색상 : " + car4.color);
		System.out.println("최고속도 : " + car4.maxSpeed);
		
	}

}

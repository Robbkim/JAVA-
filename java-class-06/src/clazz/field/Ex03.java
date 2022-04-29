package clazz.field;

class Car1 {
	
	// 필드를 메소드로 접근할 수 있다.
	
	String color;
	int speed;
	
	void upSpeed(int value) { // 메소드
		speed += value;
		
	}
}





public class Ex03 {

	public static void main(String[] args) {
		
		Car1 car1 = new Car1(); //객체생성
		car1.color = "빨강";
		car1.speed = 10;
		
		Car1 car2 = new Car1(); // 객체는 여러개 생성할 수 있다.
		car2.color = "파랑";
		car2.speed = 20;
		
		car1.upSpeed(30);
		System.out.println("자동차1의 색상은 : " + car1.color);
		System.out.println("자동차1의 속도는 : " + car1.speed);
		
		car2.upSpeed(50);
		System.out.println("자동차2의 색상은 : " + car2.color);
		System.out.println("자동차2의 속도는 : " + car2.speed);
		
		
	}

}

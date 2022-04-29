package clazz.field;

class Car2 {
	
	String color;
	int speed;
	
	void setSpeed(int speed) { // set > 저장하다, 셋팅하다
		// speed = speed;
		this.speed = speed; 
		// 매개변수와 필드의 이름이 동일하기 때문에
		// (this.필드)는 this라는 참조변수로 필드를 사용
	}
	
	int getSpeed() { // get > 얻다. 가져오다
		return speed; 
		
	}
	
	void setColor(String color) {
		this.color = color;
		
	}
	
	String getColor() {
		return color;
		
	}
}


public class Ex04 {

	public static void main(String[] args) {
	
		Car2 myCar = new Car2();
		
		// 필드로 바로 접근
		myCar.color = "빨강";
		myCar.speed = 30;
		
		System.out.println("내 자동차 색상은 : " + myCar.color);
		System.out.println("내 자동차 속도는 : " + myCar.speed);
		System.out.println();
				
		// 필드를 메소드로 접근
		myCar.setColor("파랑");
		myCar.setSpeed(50);
		
		System.out.println("내 자동차 색상은 : " + myCar.color);
		System.out.println("내 자동차 속도는 : " + myCar.speed);
		
		

	}

}

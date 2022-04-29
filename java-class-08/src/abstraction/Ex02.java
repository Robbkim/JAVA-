package abstraction;

abstract class Car{
	
	String color;
	int speed;
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
		
	}
	
	public abstract void work();
	
	public abstract void disp();
	
}

// Car 클래스를 상속받는 Truck 클래스를 만들고
// 추상메소드를 오버라이딩해서 재정의 해보자

class Truck extends Car {
	
	public Truck(String color, int speed) {
		super(color, speed);
	}
	@Override
		public void work() {
			System.out.println("Truck이 짐을 싣고 달립니다.");
			
	}
	@Override
		public void disp() {
			System.out.println("트럭은 " + color + "색이고 " + speed + "의 속도를 낼수 있습니다.");
	}		
	
}

	

public class Ex02 {

	public static void main(String[] args) {
		
		Truck truck = new Truck("파랑", 100);
		
		truck.work();
		truck.disp();
		
		
		
	}

}

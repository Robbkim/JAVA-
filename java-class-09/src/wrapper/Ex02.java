package wrapper;

public class Ex02 {

	public static void main(String[] args) {


		// 포장객체 비교
		
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);
		
		System.out.println(obj1 == obj2);

		System.out.println(obj1.equals(obj2));
		// equals() 메소드는 object 클래스의 메소드이다.
		// wrapper 클래스는 object의 equals 메소드를 재정의해서 안에 있는 값을 비교한다.
		
		
	}

}

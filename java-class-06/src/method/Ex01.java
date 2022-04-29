package method;

public class Ex01 {
	
	public static void method1() {
		System.out.println("void 형 메소드는 돌려줄 값이 없음");
		
	}
	
	public static int method2() {
		System.out.println("리턴타입은 int형인 메소드");
		int b = 100;
		return b;
	}
	
	public static void main(String[] args) {
		
		method1(); // void 메소드 호출
		
		int a;
	
		a = method2(); // int 리턴타입 메소드 호출
		// method2에서 돌려준 100값을 a로 받는다.
		System.out.println("method2에서 돌려준 값 >> " + a);
		

	}

}

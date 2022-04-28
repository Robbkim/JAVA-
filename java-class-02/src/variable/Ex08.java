package variable;

public class Ex08 {

	public static void main(String[] args) {

		byte a = 10;
		int b = a; // 자동타입변환
		
		// char ch = a; 
		// 음수가 저장될 수 있는 byte 타입을 
		// char 타입으로 자동 타입변환 시킬 수 없다.
		System.out.println(b);
		
		byte c = 10;
		byte d = 20;
		
		// byte result1 = c + d; // 에러
		// 정수의 연산시에는 기본타입인 int 타입으로 연산한다.
		// 그렇기 때문에 byte로 담을 수 없다.
		int result2 = c + d; // 자동타입변환
		System.out.println(result2);
		
		int e = 10;
		double f = 10.2;
		double result3 = e + f;
		// int 타입 피연산자가 double타입으로 자동 타입변환되고 연산을 수행
		System.out.println(result3);
		
		char ch1 = 'A';
		int g = ch1; // char 값을 실제로는 정수로 저장
		// int 타입으로 자동타입변환 될 수 있다.
		System.out.println(g);
		
		
	}

}

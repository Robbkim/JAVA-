package variable;

public class Ex07 {

	public static void main(String[] args) {
		
		//byte a = 128; // 지정된 크기보다 더 큰 수를 담을 수 없다.
		byte b = 127;
		byte c = -128;
		
		System.out.println(b);
		System.out.println(c);
		
		long d = 1234567891234567891L;
		float e = 1234567891234567891234f;
		// 실수는 더 큰 수가 표현이 가능하다. 내부적으로 다른 방식으로 저장이 된다.
		System.out.println(d);
		System.out.println(e);
		

	}

}

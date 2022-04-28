package variable;

public class Ex09 {

	public static void main(String[] args) {

		char ch1 = 'A';
		int a = ch1;
		System.out.println(a);
		
		byte b = 65;
		char ch2 = (char)b;
		// 강제타입변환 형식으로 해준다.
		System.out.println(ch2);
		
		 int c = 128; 
		 byte d = (byte)c; // 강제 타입변환
		 // 지정된 타입보다 값이 더 클 경우 강제 타입변환을 하면
		 // (overflow) : 가장 작은값으로 돌아간다.
		 System.out.println(d);
		 
		 float e = 3.99f;
		 int f = (int)e;
		 // 실수를 정수로 강제 타입변환을 하면 정수부분만 저장된다.
		 System.out.println(f);
		 
		 
		
	}

}

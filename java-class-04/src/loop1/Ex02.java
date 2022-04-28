package loop1;

public class Ex02 {

	public static void main(String[] args) {

		// for문 연습하기
		
		int i;
		
		for(i = 1; i <=5; i++) {
			
			System.out.println("for문 안입니다. i : " + i);
			
		}
		
		System.out.println("for을 나왔습니다.. i : " + i);

		// 2 4 6 8 10 출력
		
		int y;
		
		for(y = 2; y <= 10; y += 2 ) {
			
			System.out.print(y + " ");
		}
		
		
		
	}

}

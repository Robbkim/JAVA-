package print;

public class Ex01 {

	public static void main(String[] args) {

		System.out.print("()안에 내용을 출력 후 줄바꿈 X");
		System.out.print("확인해 보세요");
		System.out.println();
		// 이렇게만 썼을 경우 줄바꿈만 한다.
		
		System.out.print("좋은 하루 되세요");
		System.out.print("\n"); // 줄바꿈
		
		System.out.printf("이름 : %s", "홍길동"); // %s : 문자열
		System.out.printf("\n");
		
		System.out.printf("나이 : %d", 20); // %d : 정수
		
		
	}

}

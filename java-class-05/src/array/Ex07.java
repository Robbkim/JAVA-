package array;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50, 60};
		
		// index가 3인 값은 출력하지 말고
		// 나머지만 출력 해보세요
		
		for(int i = 0; i < array.length; i++) {
			
			if(i == 3) {
				continue;
			}
			
			System.out.println("array[" + i + "] : " + array[i]);
			
		}
		
		
	}

}

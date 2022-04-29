package array;

public class Ex11 {

	public static void main(String[] args) {
		
		
		// 배열 복사에 대해 알아보자
		
		int[] engScores = new int[] {70, 65, 80, 90, 96};
		
		// 학생 5명 영어점수를 향산된 for문으로 출력하기
		for(int eng : engScores) {
			System.out.print(eng + "  ");
			
		}
		System.out.println();
		
		// 학생이 2명 더 늘어났다면..
		int[] newEngScores= new int[7];
		
		// 배열복사
		for(int i = 0; i < engScores.length; i++) {
			newEngScores[i] = engScores[i];
			
		}
		
		for(int newEng : newEngScores) {
			
			System.out.print(newEng + "  ");
			
		}
		
		
	}

}

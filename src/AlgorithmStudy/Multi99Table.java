package AlgorithmStudy;

public class Multi99Table {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {	//int 타입 변수 i를 선언하고 1로 초기화 한다음 9이하까지 1씩 증감하여 반복한다.
			for(int j = 1; j <=9; j++) {	//i가 반복할때마다 다시 반복을 시작한다.
				System.out.printf("%3d", i*j);	//%3d 로 인하여 자리를 3자리로 만들고, i*j 를 출력하게 한다.
			}
			System.out.println();	//한 사이클이 완료되면 줄바꿈을 실시하고 다시 반복한다.
		}

	}

}

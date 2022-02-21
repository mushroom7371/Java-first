package AlgorithmStudy;

public class PrimeEx {
	public static void main(String[] args) {
		int sum = 0;
		//합을 저장할 변수
		
		for(int num = 2; num <= 100; num++) {
			int count = 0;
			//소수임을 확인하기위해 체크하는 변수
			
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					count++;
					//나머지 연산자로 나눴을때 0이 되는 수가 1과 자기 자신이면 카운트함
				}
			}
			
			if(count == 2) {	//위의 결과로 카운트가 2가 된다면 소수이기 때문에 합계로 저장한다.
				System.out.println(num);
				sum = sum + num;
			}
		}
		
		System.out.println("sum = " + sum);
		
		
	}//main
}

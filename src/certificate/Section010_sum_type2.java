package certificate;

class Section010_sum_type2 {
	//순서에 의한 1-2+3-4...+99-100합 구하기
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(true) {	//무한반복
			i++;
			sum += i;
			
			if(i >= 99) {	//항이 99가 되면 출력후 반복 종료
				System.out.println(sum);
				break;
			}else {	//아니라면 항의 숫자를 증가하고 뺀다. 이후 다시 while문 처음으로 돌아감
				i++;
				sum -= i;
			}
		}
	}
}

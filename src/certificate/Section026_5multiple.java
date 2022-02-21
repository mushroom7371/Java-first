package certificate;

class Section026_5multiple {
	//5의 배수의 개수와 합
	public static void main(String[] args) {
		int cnt, hap, mok, nmg;	
		//cnt = 5의 배수들의 갯수, hap = 5의 배수들의 합, mok = 숫자들을 5로 나눈 몫, nmg = 5로 나눈 나머지
		cnt = 0;
		hap = 0;
		
		for(int i = 1; i <= 100; i++) {	//1~100까지 반복을 실시함
			mok = i / 5;	//int타입의 특성상 나머지는 버려지기에 몫이 된다.
			
			//nmg = i - mok * 5;	//이거 나머지 연산자로 가능하지 않나?? 
			nmg = i % 5;	//나머지 연산자로 충분히 가능
			
			if(nmg == 0) {
				cnt++;	//5의 배수가 맞다면 cnt를 하나씩 증가
				hap += i;	//그리고 hap 변수에 그 값을 저장
			}
		}
		
		System.out.println("5의 배수의 갯수는 : " + cnt + " 개 이며, 그 숫자들의 합은 : " + hap + " 입니다.");		
		
	}
}

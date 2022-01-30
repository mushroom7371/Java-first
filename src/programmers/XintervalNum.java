package programmers;

//x만큼 간격이 있는 n개의 숫자
class XintervalNum {
	public long [] solution(int x, int n) {	//인자로 int 값을 받고 반환은 long 타입으로 반환
		long [] answer = new long [n];	//n개의 데이터를 저장할 것이므로 크기는 n이 된다.
		
		for(long i = 1; i <= n; i++) {	//1부터 n까지 1씩 증가하면서 반복
			answer[(int)i-1] = i*x;	//배열의 번지는 int형으로 받기에 long 타입을 형변환 한다.
		}		
		
		return answer;
	}
}

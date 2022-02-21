package programmers;

//자연수 뒤집어 배열로 만들기
class ReverseIntDigit {
	private int [] solution(long n) {
		int [] arr = new int [(int)(Math.log10(n)+1)];
		//인자값으로 받은 정수의 자릿수를 구하고, int 타입으로 형변환 한다.
        long num = n;
        
        int remainder = 0;	//몫으로 나눈 나머지를 저장 할 변수
        for(int i = 0; i < (int)(Math.log10(n)+1); i++){	//0부터 자릿수 만큼 1씩 증가면서 반복한다.
            remainder = (int)(num % 10);	//10으로 나눠서 생긴 나머지를 변수에 담고,
            arr[i] = remainder;				//배열의 i번지에 해당하는 자리에 데이터를 저장함
            num = num / 10;					//10으로 나눠 마지막 수를 날린다. 정수 타입으로 나머지는 버려진다.
        }
        return arr;
    }
}

package programmers;

//정수 제곱근 판별
class SquareRoot {
	private long solution(int n) {
		Double sqrt = Math.sqrt(n);
		//인자값으로 받은 수를 Math.sqrt()메서드를 통하여 제곱근을 구한다.
		//제곱근은 정수로 떨어지지 않을 경우가 있으므로 타입은 Double로 선언
	      
	     if(sqrt == sqrt.intValue()){	//변수의 값이 정수로 떨어진다면,
	    	 //parseInt()와 intValue()의 차이점은
	    	 //parseInt()의 경우 static 메서드로 객채 생성 없이 parameter만 넣어주면 사용 가능하며 string형 객체에서 int형 값을 뽑아 낸다.
	    	 //intValue()의 경우 static 이 아니라 Integer 객체에서 int형 값을 뽑아낸다.
	    	 
	        return (long)Math.pow(sqrt + 1, 2);
	        //pow()메서드는 제곱을 구하여 주는 메서드로 반환값은 double 타입이다. 메서드 리턴값과 같게 long 타입으로 형변환 하여 반환한다.
	        
	     } else return -1;
	}
}

package programmers;

//주식 가격
class StockPrice {
	private int [] solution(int [] prices) {
		int [] answer = new int [prices.length];	//주어진 주식 가격 배열만큼의 크기를 가지도록 설정
		
		for(int i = 0; i < prices.length; i++) {	//첫번재 번지의 데이터 부터 1씩 증가하며 비교
			for(int j = i + 1; j < prices.length; j++) {	//첫번째 반복문보다 1큰 위치의 데이터 부터 시작
				answer[i]++;	//주식이 유지된 시간이 늘어난다.
				
				if(prices[i] > prices[j]) {	//기준 주식 가격이 비교 주식 가격보다 크다면
					break;	//반복을 빠져나온다.
				}
				
			}
		}
		
		return answer;
	}
}

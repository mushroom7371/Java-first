package programmers;

//부족한 금액 계산하기
class LackOfMoney {
	private long solution(int price, int money, int count) {
        long answer = -1;
        long realPrice = 0;	//N번째 이용 금액울 저장할 변수
        long moneys = 0;	//잔고를 저장할 변수
        
        for(int i = 1; i <= count; i++) {	//1부터 count까지 1씩 증가하며 반복
        	realPrice += price*i;			//이용금액 누적
        }
        
        moneys = money - realPrice;	//잔고 계산
        
        if(moneys >= 0) {	//잔고가 0이상이면 금액이 부족하지 않다.
        	return 0;
        }else {
        	answer = Math.abs(moneys);	//음수라면 해당 값만큼 부족함 금액은 절대값으로 반환
        	return answer;
        }
    }
}

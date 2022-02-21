package programmers;

//로또의 최고 순위와 최저 순위
class LottoMaximumLowest {
	private int [] solution(int [] lottos, int [] win_nums) {
        int [] answer = {};
        int hide = 0;	//지워진 숫자
        int lowest = 7;	//최저 등수
        
        for(int i = 0; i < lottos.length; i++) {	//로또 배열의 길이만큼 1씩 증가하며 반복
        	
        	if(lottos[i] == 0) {	//해당 번지의 값이 0이라면 지워진 숫자의 카운트가 늘어난다.
        		hide++;
        	}
        	
        	for(int j = 0; j < win_nums.length; j++) {	//당첨 배열의 길이만큼 1씩 증가하며 반복
        		if(lottos[i] == win_nums[j]) {	//제출한 로또 번호가 정답이라면
        			lowest--;	//등수는 1씩 적어진다.
        		}
        	}
        }
        
        if(lowest == 7) {	//lowest 변수를 7로 선언하였기에, 하나도 일치하지 않는 경우에 최저 등수인 6등으로 설정
        	lowest = 6;
        }
        
        if(hide == 0) {	//지워진 번호가 없다면,
        	answer = new int [] {lowest, lowest};	//일치하는 번호가 최고,최저 등수가 된다.
        }else if(hide >= 6) {	//모든 숫자가 지워졌다면
        	answer = new int [] {1, 6};	//최고,최저 등수는 1 과 6이다.
        }else {	//지워진 번호가 1~5개 사이라면
        	answer = new int [] {lowest - hide, lowest};	//최고 등수는 지워진 숫자를 뺀 수가 된다. 최저는 동일
        }

        return answer;
    }
}

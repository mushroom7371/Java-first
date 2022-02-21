package AlgorithmStudy;

class timeComplexity {
	//선형검색, 이진검색을 통한 시간복잡도 공부
	//시간 복잡도 : 실행에 필요한 시간을 평가한 것
	//복잡도 표시기 O는 Order에서 따온것으로 O(n)은 'O-n', 'Order n', 'n의 Order' 등으로 읽음
	
	static int seqSearch(int [] a, int n, int key) {	//선형검색
		int i = 0;	//처음 한번 실행한 이후 실행하지 않으므로 복잡도는 O(1)
		
		while(i < n) {	//O(n/2)
			//n에 비례하는 횟수만큼 실행하는 경우 O(n)으로 표기
			//n/2 실행의 복잡도를 보통 O(n)으로 표현하는데, n의 값이 무한히 커진다고 가정할때 차이가 무의미해지기 때문
			//마찬가지로 100번만 실행하는 경우도 O(1)로 표현하는데, 컴퓨터가 100번을 계산하는 시간과 1번만 계산하는 시간의 차이는 사람이 느끼기에 비슷하기 때문
			if(a[i] == key)	//O(n/2)
				return i;	//O(1)
			i++;
		}

		return -1;	//O(1)
	}
	
	static int binSearch(int [] a, int n, int key)	{	//이진검색
		int pl = 0;	//O(1)
		int pr = n - 1;		//O(1)
		
		do {
			int pc = (pl + pr) / 2;	//O(log n)
			if(a[pc] == key) {	//O(log n)
				return pc;	//O(1)	
			}else if(a[pc] < key) {//O(log n)
				pl = pc + 1;	//O(log n)
			}else {					
				pr = pc - 1;	//O(log n)
			}
		}while(pl <= pr);	//O(log n)
		
		return -1;	//O(1)
		
		//시간 복잡도가 O(log n)으로 나타나는(처리시간이 log만큼 짧아 지는) 이유는
		//입력값 n이 주어졌을 때 문제 해결에 필요한 단계들이 연산마다 특정한 요인에 의해 줄어들기 때문
		//이진 검색의 경우에서는 검색범위를 절반으로 줄이는 단계가 이에 해당하기에 로그시간이 나타난다
	}
}

package AlgorithmStudy;

//public으로 class를 작성하여 같은 패키지 내에서라면 어디서든 사용 가능하다.
public class IntQueue {
	//private로 변수를 선언하여 해당 클래스에서만 접근 가능하다. 외부에서 접근하려면 set등으로 메서드를 정의 해야됨
	private int max;			// 큐의 용량
	private int front;			// 첫 번째 요소 커서(데이터가 나가는 곳)
	private int rear;			// 마지막 요소 커서(데이터가 들어오는 곳)
	private int num;			// 현재 데이터 수
	private int [] que;			// 큐 본체 배열

	// 큐가 비어있을 때의 예외 처리
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() { }
	}

	// 큐가 가득 찼을 때의 예외 처리
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() { }
	}

	// 생성자를 통하여 객체가 생성되면 아래의 내용으로 초기화 된다.
	public IntQueue(int capacity) {
		num = front = rear = 0;	//처음 객체 생성시 내용이 비어있기에 3개의 변수가 동일하게 0으로 시작된다.
		max = capacity;	//max는 인자값으로 받은 int 값으로 초기화
		try {
			que = new int[max];				// max값을 크기로 가지는 배열 생성, 큐의 본체로 사용
		} catch (OutOfMemoryError e) {		// 생성할 수 없음(IntStack 클래스 주석 참고)
			max = 0;
		}
	}

	// 큐에 데이터를 저장(enqueue)
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max)	//현재의 데이터가 max보다 크거나 같을 수 없음. 큐가 가득참
			throw new OverflowIntQueueException();
		que[rear++] = x;	//배열의 rear 번지에 x를 저장하고 rear 번지를 1 증가 시킨다. 이때의 시간 복잡도는 O(1)
		num++;				//데이터 수 또한 1증가된다.
		if (rear == max)	//max는 배열의 크기이고, rear는 0부터 시작하므로 max가 된다면 배열의 크기+1 번지를 의미하는데 이는 잘못된 경우다.
			rear = 0;
		return x;			//저장한 데이터인 x를 반환
	}

	// 큐에서 데이터를 꺼냄(dequeue)
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)	//큐가 비어있다면
			throw new EmptyIntQueueException();		//예외가 발생된다.
		int x = que[front++];	//데이터를 꺼내기 위해 멤버변수 x를 선언하고, que배열의 front 번지의 데이터를 대입한다. 그 후 front는 1 증가된다.
		num--;	//데이터를 꺼냈기에 갯수가 1 적어진다.
		if (front == max)	//front의 값이 queue의 용량과 같아지면 front는 0으로 되돌아간다.
			front = 0;
		return x;	//꺼낸 값을 반환
	}

	// 큐에서 데이터를 피크 (프런트 데이터를 들여다 보기만 하고 변수에 영향을 미치지는 않음)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();				// 큐가 비어 있음
		return que[front];	//큐의 front 번지의 데이터를 반환
	}

	// 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {	//queue의 첫번재 번지 부터 데이터 갯수 전까지 1씩 증가하면서 반복
			int idx = (i + front) % max;	//멤버변수 idx를 선언하고
			//배열의 시작 번지인 i와 큐의 첫번째 요소인 front를 더한 후, 용량으로 나눈 나머지를 대입한다.
			//예를 들어 큐의 용량이 10이고 첫번째 요소가 배열의 8번지에 있고, 데이터가 3개이면,
			//1회전 시 i + front는 0 + 8 % 10 = 8, 즉 idx는 8이 된다.
			//2회전 시 i + front는 1 + 8 % 10 = 9, 즉 idx는 9가 된다.
			//3회전 시 i + front는 2 + 8 % 10 = 1, 즉 idx는 0이 된다.
			//이 의미는 배열의 크기를 넘어서게 된다면 다시 처음으로 돌아온다는 뜻이다.
			if (que[idx] == x)	//위에서 계산된 idx의 번지에 찾을 데이터인 x가 있다면
				return idx;		//해당 idx를 반환한다.
		}
		return -1;	// 검색 실패
	}

	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있나요?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼나요?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 모든 데이터를 프런트 → 리어 순으로 출력
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
}

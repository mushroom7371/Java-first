package AlgorithmStudy;

public class IntStack {
	private int max;	//스택 용량
	private int ptr;	//스택 포인터
	private int [] stk;	//스택 본체 배열
	
	//스택이 비어있을때 예외처리
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {
		}
	}
	
	//스택이 가득 찼을때 예외처리
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {
		}
	}
	
	//생성자를 통하여 객체가 생성되면 아래의 내용으로 초기화 된다.
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;	//인자값으로 받은 int 변수의 값으로 용량이 정해짐
		try {
			stk = new int[max];				// 스택으로 사용할 배열
		} catch (OutOfMemoryError e) {		// 메모리 누수(leak) 상황에서 발생하는 예외일 경우 스택트레이스가 출력됨
			//자바는 개체를 힙(Heap) 공간에 생성하고 이 생성 위치에 대한 주소값을 가지고 개체 참조하는 방식으로 사용함.
			//개체를 생성하는 과정에서 힙공간에 개체를 할당할 공간이 부족할 시 발생함.
			max = 0;
		}
	}

	// 스택에 데이터 푸시(저장)
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= max)	//배열의 크기인  max를 넘을 수 없다. ptr은 포인터므로 배열의 번지보다 1크다.
			throw new OverflowIntStackException();
		return stk[ptr++] = x;	//그렇지 않다면 스택 배열의 ptr(포인터)번지에 데이터 x를 저장하고 포인터의 크기를 1 증가 시킨다.
	}

	// 스택에서 데이터를 꺼냄(맨 위의 데이터)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)	//포인터는 배열의 번지보다 1 크므로 0이하가 될 수 없다
			throw new EmptyIntStackException();
		return stk[--ptr];	//포인터-1 의 번지에 있는 데이터를 반환
	}

	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄) 
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)	//데이터가 비어있는 경우
			throw new EmptyIntStackException();
		return stk[ptr - 1];	//데이터가 있다면, 포인터-1 번지에 있는(마지막 데이터)를 반환
	}

	// 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)	//배열의 마지막 번지 부터 첫번째 번지까지 한개씩 줄여가면서
			if (stk[i] == x)	//해당 번지의 값이 인자로 받은 데이터 x와 같다면
				return i;	//해당 번지를 반환
		return -1;
	}

	// 스택을 비움
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}

	// 스택에 쌓여 있는 데이터 수를 반환
	public int size() {
		//배열은 0번지부터 시작이고, 포인터는 1번지 부터 시작이므로 n개의 데이터 가 있다고 가정하면
		//0번지 ~ n-1 번지의 갯수나, 1 ~ n 까지의 갯수나 같은 결과를 가져온다. 이 때문에 포인터가 갯수가 된다.
		return ptr;
	}

	// 스택이 비어 있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}

	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}

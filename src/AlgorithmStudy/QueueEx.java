package AlgorithmStudy;

public class QueueEx {
	
	int MAX = 1000;
	int front;	//큐의 첫번째에 위치할 index값 pop할때 참고한다.
	int rear;	//큐의 마지막에 위치할 index값 push할때 참고한다.
	int [] queue;	//기본배열을 이용해서 큐를 구현할 것임
	
	public QueueEx() {
		front = rear = 0;	//큐의 구조상 처음과 마지막 통로가 열려있음 생성자로 최초생성시 초기화 하는 작업
		queue = new int[MAX];	//위에 선언한 전역변수 MAX의 최대 크기만큼 배열의 크기를 설정
	}
	
	public boolean queueIsEmpty() {
		return front == rear;	//마찬가지로 큐는 뚫린 통로이므로 front와 rear 가 같다면 값이 없다는 것을 알수있음
	}
	
	public boolean queueIsFull() {
		if(rear == MAX-1) {	//마지막을 판단하는 rear 가 MAX-1 이면 가득 차있다는 뜻
			return true;
		}else {
			return false;
		}
	}
	
	public int size() {	//현재 큐에 들어있는 데이터의 갯수를 파악하기 위한 메서드
		return front - rear;
	}
	
	public void push(int value) {	//큐가 가득차있다면 아무것도 안하고
		if(queueIsFull()) {
			System.out.println("Queue is Full");
			return;
		}
		
		queue[rear++] = value;	//빈 공간이 있다면 큐의 rear번지수에 매개변수로 들어온 value를 데이터로 넣어주고 rear의 값을 1 증가시킴
	}
	
	public int pop() {	//큐가 비어있는 상태라면 아무것도 안하고
		if(queueIsEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int popValue = queue[front++];	//데이터가 있다면 새로 선언한 변수에 queue 번지수의 데이터를 담은 다음 번지수를 증가시킨다.
		return popValue;
	}
	
	public int peek() {
		if(queueIsEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		 int popValue = queue[front];
	        return popValue;
	}
}

package AlgorithmStudy;

public class QueueEx {
	
	int MAX = 1000;
	int front;	//ť�� ù��°�� ��ġ�� index�� pop�Ҷ� �����Ѵ�.
	int rear;	//ť�� �������� ��ġ�� index�� push�Ҷ� �����Ѵ�.
	int [] queue;	//�⺻�迭�� �̿��ؼ� ť�� ������ ����
	
	public QueueEx() {
		front = rear = 0;	//ť�� ������ ó���� ������ ��ΰ� �������� �����ڷ� ���ʻ����� �ʱ�ȭ �ϴ� �۾�
		queue = new int[MAX];	//���� ������ �������� MAX�� �ִ� ũ�⸸ŭ �迭�� ũ�⸦ ����
	}
	
	public boolean queueIsEmpty() {
		return front == rear;	//���������� ť�� �ո� ����̹Ƿ� front�� rear �� ���ٸ� ���� ���ٴ� ���� �˼�����
	}
	
	public boolean queueIsFull() {
		if(rear == MAX-1) {	//�������� �Ǵ��ϴ� rear �� MAX-1 �̸� ���� ���ִٴ� ��
			return true;
		}else {
			return false;
		}
	}
	
	public int size() {	//���� ť�� ����ִ� �������� ������ �ľ��ϱ� ���� �޼���
		return front - rear;
	}
	
	public void push(int value) {	//ť�� �������ִٸ� �ƹ��͵� ���ϰ�
		if(queueIsFull()) {
			System.out.println("Queue is Full");
			return;
		}
		
		queue[rear++] = value;	//�� ������ �ִٸ� ť�� rear�������� �Ű������� ���� value�� �����ͷ� �־��ְ� rear�� ���� 1 ������Ŵ
	}
	
	public int pop() {	//ť�� ����ִ� ���¶�� �ƹ��͵� ���ϰ�
		if(queueIsEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int popValue = queue[front++];	//�����Ͱ� �ִٸ� ���� ������ ������ queue �������� �����͸� ���� ���� �������� ������Ų��.
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

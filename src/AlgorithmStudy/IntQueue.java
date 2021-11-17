package AlgorithmStudy;

//public���� class�� �ۼ��Ͽ� ���� ��Ű�� ��������� ��𼭵� ��� �����ϴ�.
public class IntQueue {
	//private�� ������ �����Ͽ� �ش� Ŭ���������� ���� �����ϴ�. �ܺο��� �����Ϸ��� set������ �޼��带 ���� �ؾߵ�
	private int max;			// ť�� �뷮
	private int front;			// ù ��° ��� Ŀ��(�����Ͱ� ������ ��)
	private int rear;			// ������ ��� Ŀ��(�����Ͱ� ������ ��)
	private int num;			// ���� ������ ��
	private int [] que;			// ť ��ü �迭

	// ť�� ������� ���� ���� ó��
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() { }
	}

	// ť�� ���� á�� ���� ���� ó��
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() { }
	}

	// �����ڸ� ���Ͽ� ��ü�� �����Ǹ� �Ʒ��� �������� �ʱ�ȭ �ȴ�.
	public IntQueue(int capacity) {
		num = front = rear = 0;	//ó�� ��ü ������ ������ ����ֱ⿡ 3���� ������ �����ϰ� 0���� ���۵ȴ�.
		max = capacity;	//max�� ���ڰ����� ���� int ������ �ʱ�ȭ
		try {
			que = new int[max];				// max���� ũ��� ������ �迭 ����, ť�� ��ü�� ���
		} catch (OutOfMemoryError e) {		// ������ �� ����(IntStack Ŭ���� �ּ� ����)
			max = 0;
		}
	}

	// ť�� �����͸� ����(enqueue)
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max)	//������ �����Ͱ� max���� ũ�ų� ���� �� ����. ť�� ������
			throw new OverflowIntQueueException();
		que[rear++] = x;	//�迭�� rear ������ x�� �����ϰ� rear ������ 1 ���� ��Ų��. �̶��� �ð� ���⵵�� O(1)
		num++;				//������ �� ���� 1�����ȴ�.
		if (rear == max)	//max�� �迭�� ũ���̰�, rear�� 0���� �����ϹǷ� max�� �ȴٸ� �迭�� ũ��+1 ������ �ǹ��ϴµ� �̴� �߸��� ����.
			rear = 0;
		return x;			//������ �������� x�� ��ȯ
	}

	// ť���� �����͸� ����(dequeue)
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)	//ť�� ����ִٸ�
			throw new EmptyIntQueueException();		//���ܰ� �߻��ȴ�.
		int x = que[front++];	//�����͸� ������ ���� ������� x�� �����ϰ�, que�迭�� front ������ �����͸� �����Ѵ�. �� �� front�� 1 �����ȴ�.
		num--;	//�����͸� ���±⿡ ������ 1 ��������.
		if (front == max)	//front�� ���� queue�� �뷮�� �������� front�� 0���� �ǵ��ư���.
			front = 0;
		return x;	//���� ���� ��ȯ
	}

	// ť���� �����͸� ��ũ (����Ʈ �����͸� �鿩�� ���⸸ �ϰ� ������ ������ ��ġ���� ����)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();				// ť�� ��� ����
		return que[front];	//ť�� front ������ �����͸� ��ȯ
	}

	// ť���� x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {	//queue�� ù���� ���� ���� ������ ���� ������ 1�� �����ϸ鼭 �ݺ�
			int idx = (i + front) % max;	//������� idx�� �����ϰ�
			//�迭�� ���� ������ i�� ť�� ù��° ����� front�� ���� ��, �뷮���� ���� �������� �����Ѵ�.
			//���� ��� ť�� �뷮�� 10�̰� ù��° ��Ұ� �迭�� 8������ �ְ�, �����Ͱ� 3���̸�,
			//1ȸ�� �� i + front�� 0 + 8 % 10 = 8, �� idx�� 8�� �ȴ�.
			//2ȸ�� �� i + front�� 1 + 8 % 10 = 9, �� idx�� 9�� �ȴ�.
			//3ȸ�� �� i + front�� 2 + 8 % 10 = 1, �� idx�� 0�� �ȴ�.
			//�� �ǹ̴� �迭�� ũ�⸦ �Ѿ�� �ȴٸ� �ٽ� ó������ ���ƿ´ٴ� ���̴�.
			if (que[idx] == x)	//������ ���� idx�� ������ ã�� �������� x�� �ִٸ�
				return idx;		//�ش� idx�� ��ȯ�Ѵ�.
		}
		return -1;	// �˻� ����
	}

	// ť�� ���
	public void clear() {
		num = front = rear = 0;
	}

	// ť�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ť�� �׿� �ִ� ������ ���� ��ȯ
	public int size() {
		return num;
	}

	// ť�� ��� �ֳ���?
	public boolean isEmpty() {
		return num <= 0;
	}

	// ť�� ���� á����?
	public boolean isFull() {
		return num >= max;
	}

	// ť ���� ��� �����͸� ����Ʈ �� ���� ������ ���
	public void dump() {
		if (num <= 0)
			System.out.println("ť�� ��� �ֽ��ϴ�.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
}

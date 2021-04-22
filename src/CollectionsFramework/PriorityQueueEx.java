package CollectionsFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String args []) {
		Queue pq = new PriorityQueue();	//Queue�� �������̽��θ� �����Ͽ� �̸� ��ӹ޴� ���� Ŭ������ ����ؾߵȴ�.
										//PriorityQueue�� Queue�������̽� ����ü�� ��������� ������� �켱������ ���� �ͺ��� ������.
		
		pq.offer(3);	//pq.offer(new Integer(3));���� �����ؾߵ����� ����ڽ��� �̷������.
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		
		System.out.println(pq);	// ����� ������� ����ϸ� 31524�� �Ǿߵ����� ��(heap)�̶�� �ڷᱸ���� ���·� �����Ͽ� ������ �ٸ��� �ڼ����� �𸣳� JVM�� heap���� �ٸ��ٰ���
		
		Object obj = null;	//Object Ÿ���� ���������� �����͸� null�� �ʱ�ȭ�Ѵ�. ������Ʈ Ŭ������ ��� Ŭ������ �����̴�.
		
		while((obj = pq.poll())!=null) {	//������ ���� ������ �𸣴� ��� ����ϴ� while �ݺ������� �������� obj �� �ν��Ͻ� pq�� �����͸� �ϳ��� ���� �����Ѵ�.
											//������ ��Ȥ�ϴٰ� �� ���� null �ϰ�� ���ǹ��� ������ �Ǿ� �ߴ��Ѵ�, �� obj�� ����� ���� ������ ���� �ݺ��Ѵ�.
			System.out.println(obj);		//obj�� ���� ����Ѵ�. ���������� ��µ�
		}
	}
}

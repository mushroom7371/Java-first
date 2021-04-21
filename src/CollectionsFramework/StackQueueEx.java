package CollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
	public static void main(String [] args) {
		Stack st = new Stack();			//Stack�� �ڹ� ������ Ŭ������ �����ϱ⿡ StackŸ������ �ν��Ͻ� ������ �����ϴ�.
		Queue q = new LinkedList();		//Queue�� �������̽��� �����ϱ� ������ �̸� �����ϱ� ���ؼ��� ��ӹ޴� Ŭ������ ����ؾߵȴ�.
		
		st.push("0");		//stack�� ��� push()�޼��带 ���Ͽ� ������(��ü)�� �����Ѵ�. 
		st.push("1");
		st.push("2");
		
		q.offer("0");		//queue�� ��� offer()�޼��带 ���Ͽ� ������(��ü)�� �����Ѵ�.
		q.offer("1");
		q.offer("2");
		
		System.out.println(" == Stack == ");
		while(!st.empty()) {	//�������� �ݺ����� �𸦶� ����ϴ� while ���� ����Ͽ� stack Ŭ���� ������ empty()�޼��带 ���Ͽ� �����Ͱ� ����ֱ� ������ �ݺ��Ѵ�.
			System.out.println(st.pop());	//Stack�� pop()�޼��带 ���� ��ü�� ������ Stack�� ���� �����ִ� ������ �ʰ� �� ���� ���� ���´�.
		}
		
		System.out.println(" == Queue == ");
		while(!q.isEmpty())	{	//���������� �����Ͱ� �ִ� �������� �ݺ��� �����Ѵ�.
			System.out.println(q.poll());	//queue�� poll()�޼��带 ���Ͽ� ��ü�� ������ ��ȯ�Ѵ�. ���� �շ��δ� ����� ������ ���� �� �����Ͱ� ���� ���´�.
		}
	}
}

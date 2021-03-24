package Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
	public static void main(String args []) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0"); //Stack st�� push�� �����͸� �����Ѵ�.
		st.push("1");
		st.push("2");
		
		q.offer("0"); //Queue q�� offer�� �����͸� �����Ѵ�.
		q.offer("1");
		q.offer("2");
		
		System.out.println(" = Stack = ");
		while(!st.empty()) {
			System.out.println(st.pop());	//Stack st�� pop()�� �����Ѵ�.
		}
		
		System.out.println(" = Queue = ");
		while(!q.isEmpty()) {
			System.out.println(q.poll());	//Queue q�� poll()�� �����Ѵ�.
		}
	}
}


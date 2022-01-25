package Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
	public static void main(String args []) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0"); //Stack st의 push로 데이터를 저장한다.
		st.push("1");
		st.push("2");
		
		q.offer("0"); //Queue q의 offer로 데이터를 저장한다.
		q.offer("1");
		q.offer("2");
		
		System.out.println(" = Stack = ");
		while(!st.empty()) {
			System.out.println(st.pop());	//Stack st의 pop()로 추출한다.
		}
		
		System.out.println(" = Queue = ");
		while(!q.isEmpty()) {
			System.out.println(q.poll());	//Queue q의 poll()로 추출한다.
		}
	}
}


package CollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
	public static void main(String [] args) {
		Stack st = new Stack();			//Stack은 자바 내에서 클래스로 존재하기에 Stack타입으로 인스턴스 생성이 가능하다.
		Queue q = new LinkedList();		//Queue는 인터페이스로 존재하기 때문에 이를 구현하기 위해서는 상속받는 클래스를 사용해야된다.
		
		st.push("0");		//stack의 경우 push()메서드를 통하여 데이터(객체)를 저장한다. 
		st.push("1");
		st.push("2");
		
		q.offer("0");		//queue의 경우 offer()메서드를 통하여 데이터(객체)를 저장한다.
		q.offer("1");
		q.offer("2");
		
		System.out.println(" == Stack == ");
		while(!st.empty()) {	//언제까지 반복될지 모를때 사용하는 while 문을 사용하여 stack 클래스 내부의 empty()메서드를 통하여 데이터가 비어있기 전까지 반복한다.
			System.out.println(st.pop());	//Stack의 pop()메서드를 통해 객체를 꺼낸다 Stack은 길이 막혀있는 구조로 늦게 들어간 값이 먼저 나온다.
		}
		
		System.out.println(" == Queue == ");
		while(!q.isEmpty())	{	//마찬가지로 데이터가 있는 지점까지 반복을 실행한다.
			System.out.println(q.poll());	//queue의 poll()메서드를 통하여 객체를 꺼내서 반환한다. 길이 뚫려인느 양방향 구조로 먼저 들어간 데이터가 먼저 나온다.
		}
	}
}

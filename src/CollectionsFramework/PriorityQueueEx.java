package CollectionsFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String args []) {
		Queue pq = new PriorityQueue();	//Queue는 인터페이스로만 존재하여 이를 상속받는 하위 클래스를 사용해야된다.
										//PriorityQueue는 Queue인터페이스 구현체로 저장순서에 관계없이 우선순위가 높은 것부터 꺼낸다.
		
		pq.offer(3);	//pq.offer(new Integer(3));으로 정의해야되지만 오토박싱이 이루어졌다.
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		
		System.out.println(pq);	// 저장된 순서대로 출력하면 31524가 되야되지만 힙(heap)이라는 자료구조의 형태로 저장하여 순서가 다르다 자세히는 모르나 JVM의 heap과는 다르다고함
		
		Object obj = null;	//Object 타입의 참조변수의 데이터를 null로 초기화한다. 오브젝트 클래스는 모든 클래스의 조상이다.
		
		while((obj = pq.poll())!=null) {	//조건이 언제 끝날지 모르는 경우 사용하는 while 반복문으로 참조변수 obj 에 인스턴스 pq의 데이터를 하나씩 꺼내 저장한다.
											//저장을 반혹하다가 그 값이 null 일경우 조건문은 거짓이 되어 중단한다, 즉 obj에 저장될 값이 있을때 까지 반복한다.
			System.out.println(obj);		//obj의 값을 출력한다. 순차적으로 출력됨
		}
	}
}

package ch11;

import java.util.Vector;

class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5);	//용량(capacity)가 5인 Vector 객체를 생성한다.
		
		v.add("1");
		v.add("2");
		v.add("3");
		//각각의 번지에 3개의 객체를 저장한다.
		print(v);
		
		v.trimToSize();
		//Vector 객체의 빈 공간을 제거한다. (용량과 크기가 같아진다)
		//배열은 크기를 변경 할 수 없기 때문에 참조변수 v는 기존의 객체가 아닌 trimtoSize() 메서드로 생성된 새로운 객체를 가리키게 된다.
		//또한 기존의 객체는 가비지컬렉터에 의해 제거된다.
		System.out.println("===After trimToSize()===");
		print(v);
		
		v.ensureCapacity(6);
		//객체의 capacity가 최소 6이 되도록 설정한다. 6보다 크다면 아무일이 일어나지 않지만 작다면 새로운 객체를 생성하여 복사한다.
		System.out.println("===After ensureCapacity(6)===");
		print(v);
		
		v.setSize(7);
		//size를 7이 되도록 한다. 만일 capacity가 충분하면 아무일이 일어나지 않지만, 지금은 capacity가 6 이므로 새로 인스턴스를 생성한다.
		//Vector는 capacity가 부족할 경우 자동으로 기존의 크기보다 2배의 크기로 증가시킨다.
		System.out.println("===After setSize(7)===");
		print(v);
		
		v.clear();
		//모든 요소를 삭제한다.
		System.out.println("===After clear()===");
		print(v);
	}
	
	public static void print(Vector v) {	//static 메서드로 객체 생성없이 메모리에 클래스가 적재될때 사용가능함
		System.out.println(v);	//Vector 객체의 내용물을 확인 한다
		System.out.println("size : " + v.size());	//객체의 크기 확인
		System.out.println("capacity : " + v.capacity());	//객체의 용량 확인
	}
}

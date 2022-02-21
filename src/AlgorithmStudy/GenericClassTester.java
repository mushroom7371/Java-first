package AlgorithmStudy;

import java.lang.reflect.GenericSignatureFormatError;

public class GenericClassTester {
	
	static class GenericClass<T>{	//static 클래스로 선언하여 메모리에 적재 될때 선언된다.
		
		private T xyz;	//private 제어자로 현재 클래스에서만 사용 가능하도록 함
		GenericClass(T t){
			this.xyz = t;	//생성자를 통해 매개변수로 받은 값을 변수로 지정한다.
		}
		
		T getXyz() {	//get 메서드를 통하여 다른 곳에서 값을 읽을 수 있도록 함
			return xyz;
		}
		
	}
	
	public static void main(String[] args) {
		
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());	//객체를 생성할때 제너릭으로 설정한 타입만 저장할 수 있도록 하였고, 메서드를 통하여 값을 불어올 수 있도록 하였다.
		System.out.println(n.getXyz());
	}
	
	
}

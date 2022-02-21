package AlgorithmStudy;

public class MaxMinMethod {
	public static void main(String [] args) {
		MaxMinMethod mmm = new MaxMinMethod();
		//MaxMinMetho 클래스의 public 제어자로 선언한 max4() 메서드를 사용하기 위하여 객체를 생성한다.
		
		int max = mmm.max4(632, 28956, 34, 185);
		//만약 max4() 객체를 생성하지 않고 사용한다면 이 메서드는 사용이 불가능 하다.
		int min = min3(28956, 34, 185);
		//min3() 메서드는 static 제어자로 선언하였기에 클래스가 메모리에 올라갈때 생성된다.
		//그러므로 따로 객체를 생성하지 않아도 사용가능하다. 위의 public으로 선언한 메서드와 다르다.
		
		System.out.println(max);
		System.out.println(min);
		
	}

	public int max4(int a, int b, int c, int d) {
		//메서드의 매개변수로 입력받은 값의 최대값을 구하는 메서드 리턴값을 int로 가진다.
		int max = a;	//max값을 구하기 위해 선언한 변수로 초기값을 매개변수로 받은 수 중 하나로 가지게 한다.
		
		if(max < b) { max = b;}	//max와 b 중 b가 더 크다면, b가 최대값이 될것이기에 max의 값을 최대값으로 설정한다. 아니라면 아무동작을 하지 않는다.
		if(max < c) { max = c;}
		if(max < d)	{ max = d;}		
		
		return max;
		//위의 조건문을 거치고 내려온 값이 최대값이 되어 이를 반환한다.
	}
	
	static int min3(int a, int b, int c) {	//static으로 선언한 메서드 객체 생성이 필요없다.
		int min = a;	//max4메서드와 반대로 최소값을 확인하기 위한 메서드
		
		if(min > b) { min = b;}
		if(min > c) { min = c;}
		
		return min;
	}
}

package CollectionsFramework;

import java.util.Stack;

public class StackEx1 {
	public static Stack back = new Stack(); //main 내부에서 선언한 것이 아니라 public 으로 전역에서 접근 가능하도록 하고,
	public static Stack forward = new Stack();	//static 으로 인해서 클래스가 메모리에 올라갈때 생성이 되는 Stack 클래스를 인스턴스화 한다.
	
	public static void main(String [] args) {
		goURL("1.네이트");	//goURL 메서드로 인해 파라메터 값이 back에 차곡차곡 쌓이게 된다.
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");
		
		printStatus();	//출력
		
		goBack();	//goBack 메서드가 호출되면, back의 마지막 객체가 forward에 저장된다.
		System.out.println(" = 뒤로 버튼을 누른 후 = ");
		printStatus();	//이 때문에 back의 마지막 데이터 3.네이버 가 표시된다.
						//또한 forward에는 4.다음 이 저장되어있다.
		
		goBack();
		System.out.println(" = 뒤로 버튼을 누른 후 = ");
		printStatus();	//back의 3.네이버 가 forward로 옮겨지며
						//forward는 stack의 특성상 4.다음 3.네이버 의 순서로 저장되어 있다.
		
		goForward();	//이 메서드로 통해서 forward의 3.네이버 가 back의 마지막 위치로 이동하게 된다.
		System.out.println(" = 앞으로 버튼을 누른 후 = ");
		printStatus();
		
		goURL("github.com/mushroom7371");	//새로운 파라메터값이 back  에 저장되고 forward에는 clear 메서드로 인해 4.다음 의 데이터가 삭제된다.
		System.out.println(" = 새로운 주소를 입력 후 = ");
		printStatus();
		
	}
	
	public static void printStatus() {	//출력 메서드
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재 화면은 " + back.peek() + " 입니다.");	//지금 현재 back에 저장된 마지막 값을 읽어온다.
		System.out.println();
	}
	
	public static void goURL(String url) {	//String 타입을 매개변수로 goURL()를 선언하는데 위의 인스턴스 생성과 마찬가지로 public 으로 전역에서 접근가능하고, static으로 객체 생성이 필요없이 접근 가능한 메서드
		back.push(url);	//메서드를 호출하면 생성한 Stack 타입의 back에 파라메터를 객채로 저장한다.
		if(!forward.empty())	//만약 forward 인스턴스에 데이터가 저장되어있다면
			forward.clear();	//forward의 모든 데이터를 삭제한다.
	}
	
	public static void goForward() {	//반환값이 없는 메서드선언.
		if(!forward.empty())	//만약 forward에 데이터가 있다면,
			back.push(forward.pop());	//back에다가 forward에 저장되어있는 마지막 데이터를 뽑아내서 저장한다.(stack의 데이터 저장방식이 막힌길이기에 마지막 저장 데이터가 꺼내지게 되는것이다.)
			
	}
	
	public static void goBack() {	//goForward 메서드와 마찬가지 방식으로 기능이 구현된다.
		if(!back.empty())
			forward.push(back.pop());
	}
}

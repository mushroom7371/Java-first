package AlgorithmStudy;

import java.io.InputStream;
import java.util.Scanner;

public class StackEx {
	private int maxSize;
	private int top;
	private Object [] stackArray;
	//스택 객체를 생성 시 필요한 변수 정의 크기, 최상단, 입력할 데이터등을 정의하였음
	
	public StackEx(int maxSize){
		this.maxSize = maxSize;
		this.stackArray = new Object[maxSize];
		this.top = -1;
		//생성자를 통해서 객체 생성시 클래스에 정의한 변수에 위와 같은 정보로 생성함
		//this.top 이 -1인 것은 빈 스택의 경우 번지가 -1이기 때문
		
	}
	
	public boolean empty() {
		return (top == -1);
	}
	//스택이 비어있다면 아무것도 없기에 초기값인 -1로 설정
	
	public boolean full() {
		return (top == maxSize-1);
	}
	//스택이 가득 찼다면 top을 객체 생성시 최초 크기로 설정
	
	public boolean push(Object item) {
		if(full()) {
			System.out.println("stack full!");
			return false;
		}
		//스택이 가득찼다면 반환값을 false로 하고 아무것도 하지 않는다.
		stackArray[++top] = item;
		return true;
		//공간이 남아있다면 top의 값을 먼저 증가시킨후 그 번지수의 주소 값을 매개변수로 들어온 item의 주소로 저장한다.
	}
	
	public Object pop() {
		if(empty()) {
			System.out.println("stack empty!");
			return null;
		//스택이 비어있다면 아무것도 하지 않는다.
		}else {
			Object item = stackArray[top];
			stackArray[top] = null;
			top--;
			return item;
		}
		//스택에 값이 저장되어있다면 Object 타입의 참조변수에 해당스택의 최상위 주소를 저장하고,
		//해당 스택의 주소값을 초기화 한후 해당 번지수를 감소시킨다.
	}
	
	public void stackPrint(StackEx stackEx) {
		if(top != -1) {
			for(int i = top; i <= top; i--) {
				if(i == -1)
					break;
				//스택의 값은 FILO으로 맨 마지막 순서부터 출력을 실시하게 된다.
				System.out.println("| " + stackEx.stackArray[i] + " |");
				System.out.println("----------");
			}
		}else {
			System.out.println("stack empty");
		}
	}
	
	public static void menu() {
		System.out.println("1. push");
		System.out.println("2. pop");
		System.out.println("3. STACK");
		System.out.println("Q. 종료");
	}
	//단순 메뉴 출력 메서드
	
	public static void main(String[] args) {
		InputStream a = System.in;
		Scanner sc = new Scanner(a);
		
		System.out.println("스택 size 입력 : ");
		int size = sc.nextInt();
		StackEx arrayStack = new StackEx(size);
		
		boolean flag = true;
		
		while(flag) {
			menu();
			String s = sc.next();
			
			switch(s) {
			case "1" :
				System.out.print("PUSH : ");
				String data = sc.next();
				arrayStack.push(data);
				break;
			case "2" : 
				System.out.println("POP : " + arrayStack.pop());
				break;
			case "3" :
				arrayStack.stackPrint(arrayStack);
				break;
			case "q" :
			case "Q" :
				flag = false;
				break;
			}
		}
	}
	
	
}

package AlgorithmStudy;

import java.io.InputStream;
import java.util.Scanner;

public class StackEx {
	private int maxSize;
	private int top;
	private Object [] stackArray;
	//���� ��ü�� ���� �� �ʿ��� ���� ���� ũ��, �ֻ��, �Է��� �����͵��� �����Ͽ���
	
	public StackEx(int maxSize){
		this.maxSize = maxSize;
		this.stackArray = new Object[maxSize];
		this.top = -1;
		//�����ڸ� ���ؼ� ��ü ������ Ŭ������ ������ ������ ���� ���� ������ ������
		//this.top �� -1�� ���� �� ������ ��� ������ -1�̱� ����
		
	}
	
	public boolean empty() {
		return (top == -1);
	}
	//������ ����ִٸ� �ƹ��͵� ���⿡ �ʱⰪ�� -1�� ����
	
	public boolean full() {
		return (top == maxSize-1);
	}
	//������ ���� á�ٸ� top�� ��ü ������ ���� ũ��� ����
	
	public boolean push(Object item) {
		if(full()) {
			System.out.println("stack full!");
			return false;
		}
		//������ ����á�ٸ� ��ȯ���� false�� �ϰ� �ƹ��͵� ���� �ʴ´�.
		stackArray[++top] = item;
		return true;
		//������ �����ִٸ� top�� ���� ���� ������Ų�� �� �������� �ּ� ���� �Ű������� ���� item�� �ּҷ� �����Ѵ�.
	}
	
	public Object pop() {
		if(empty()) {
			System.out.println("stack empty!");
			return null;
		//������ ����ִٸ� �ƹ��͵� ���� �ʴ´�.
		}else {
			Object item = stackArray[top];
			stackArray[top] = null;
			top--;
			return item;
		}
		//���ÿ� ���� ����Ǿ��ִٸ� Object Ÿ���� ���������� �ش罺���� �ֻ��� �ּҸ� �����ϰ�,
		//�ش� ������ �ּҰ��� �ʱ�ȭ ���� �ش� �������� ���ҽ�Ų��.
	}
	
	public void stackPrint(StackEx stackEx) {
		if(top != -1) {
			for(int i = top; i <= top; i--) {
				if(i == -1)
					break;
				//������ ���� FILO���� �� ������ �������� ����� �ǽ��ϰ� �ȴ�.
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
		System.out.println("Q. ����");
	}
	//�ܼ� �޴� ��� �޼���
	
	public static void main(String[] args) {
		InputStream a = System.in;
		Scanner sc = new Scanner(a);
		
		System.out.println("���� size �Է� : ");
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

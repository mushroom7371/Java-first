package JavaStudy;

public class ArrayList {
	
	private int size = 0;	//private 접근제어자로 인하여 현재 클래스에서만 접근 가능하다.
	private Object[] elementData = new Object[50];
	//Object 타입의 배열을 담는 참조변수 elementData를 선언하고 여기에 ObJect클래스로 부터 생성한 길이 50의 배열의 주소값을 저장한다.

	public boolean addLast(Object e){	//논리형 값을 반환받는 메서드를 선언하되 매개변수로 Object 타입을 받는다
	        elementData[size++] = e;	//배열의 번지에 size + 1의 값을 넣고 매개변수의 값을 대입한다.
	        return true;	//return 값을 반환한다. ??왜 메서드의 리턴값을 boolean 형태로 가지는지 모르겠음.
	    }

	    public boolean add(int index, Object element){	//메서드를 선언하고, 매개변수로 정수 타입과 Object 타입을 받는다.
	        for (int i = size - 1; i >= index; i--) {	//size의 마지막 앞에서 부터 index까지 뒤에서 부터 앞으로 1씩 감소하며 반복한다.
	            elementData[i + 1] = elementData[i];	//elementData의 마지막 번지수에 바로 앞 번지수의 값을 저장한다.
	        }
	        
	        elementData[index] = element;	//복사를 완료하고 나서 index 번지수에 element값을 대입한다.
	        size++;	//작업이 완료되면 size의 값을 1 증가 시킨다.
	        return true;	//<= 왜 리턴값을 받는지?
	    }
	    
	    public boolean addFirst(Object element)	{	//배열의 첫번째 값을 추가하는 메서드
	        return add( 0, element );	//위의 add 메서드를 통하여 0번째 데이터를 매개변수로 받는 값으로 저장한다.
	    }
	}


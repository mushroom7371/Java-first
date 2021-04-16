package JavaStudy;

public class ArrayList {
	
	private int size = 0;	//private ���������ڷ� ���Ͽ� ���� Ŭ���������� ���� �����ϴ�.
	private Object[] elementData = new Object[50];
	//Object Ÿ���� �迭�� ��� �������� elementData�� �����ϰ� ���⿡ ObJectŬ������ ���� ������ ���� 50�� �迭�� �ּҰ��� �����Ѵ�.

	public boolean addLast(Object e){	//���� ���� ��ȯ�޴� �޼��带 �����ϵ� �Ű������� Object Ÿ���� �޴´�
	        elementData[size++] = e;	//�迭�� ������ size + 1�� ���� �ְ� �Ű������� ���� �����Ѵ�.
	        return true;	//return ���� ��ȯ�Ѵ�. ??�� �޼����� ���ϰ��� boolean ���·� �������� �𸣰���.
	    }

	    public boolean add(int index, Object element){	//�޼��带 �����ϰ�, �Ű������� ���� Ÿ�԰� Object Ÿ���� �޴´�.
	        for (int i = size - 1; i >= index; i--) {	//size�� ������ �տ��� ���� index���� �ڿ��� ���� ������ 1�� �����ϸ� �ݺ��Ѵ�.
	            elementData[i + 1] = elementData[i];	//elementData�� ������ �������� �ٷ� �� �������� ���� �����Ѵ�.
	        }
	        
	        elementData[index] = element;	//���縦 �Ϸ��ϰ� ���� index �������� element���� �����Ѵ�.
	        size++;	//�۾��� �Ϸ�Ǹ� size�� ���� 1 ���� ��Ų��.
	        return true;	//<= �� ���ϰ��� �޴���?
	    }
	    
	    public boolean addFirst(Object element)	{	//�迭�� ù��° ���� �߰��ϴ� �޼���
	        return add( 0, element );	//���� add �޼��带 ���Ͽ� 0��° �����͸� �Ű������� �޴� ������ �����Ѵ�.
	    }
	}


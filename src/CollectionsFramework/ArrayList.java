package CollectionsFramework;

public class ArrayList {
	
	private int size = 0;	//private ���������ڷ� ���Ͽ� ���� Ŭ���������� ���� �����ϴ�.
	private Object[] elementData = new Object[50];
	//Object Ÿ���� �迭�� ��� �������� elementData�� �����ϰ� ���⿡ ObJectŬ������ ���� ������ ���� 50�� �迭�� �ּҰ��� �����Ѵ�.

	public int size() {	//private�� ����� size�� ���� �ٸ� ������ ����ϱ� ���� �޼���
		return size;
	}
	
	public int indexOf(Object e) {
		for(int i=0; i<size; i++) {
			if(e.equals(elementData[i])){
				return i;
			}
		}
		
		return -1;
	}
	
	public Object get(int index) {	//Object Ÿ���� ��ȯ�ϴ� int�� �Ű������� �޴� get �޼���, �ش� index�� ���� �˱����� ����
		return elementData[index];	//������ �ȿ� �Ű������� int ���� ������(���⼭�� �������� �ȴ�) �� index�� ���� ��ȯ�Ѵ�.
	}
	
	public String toString() {	//���ڿ��� ��ȯ�ϴ� �޼��带 ���ϴ� ��� �������̵� ��. �迭���� ���� ����Ϸ��� ����
		String str = "[";		//����Ÿ�� str�� �����ϰ� �ʱ�ȭ �Ѵ�.
		for(int i =0; i<size; i++) {	//�迭�� 0���� ���� �����ϹǷ� size���� ���� ������ �ݺ��Ѵ�.
			str = str + elementData[i];	//�ݺ��� �ɶ� ���� str�� str+ �ش� �������� ���� ���Ѵ�.
			
			if(i < size -1) {	//size-1 ���� �����ϰ� �Ǹ� [1,2,3,] �̷������� ���� ������������ ������ ������ ����
				str= str+",";	//�ݺ������� �����ϸ鼭 �������� �� �ڿ� ","�� ���Ѵ�.
			}
		}		
		
		return str + "]";	//���������� ���� �������� ���� str�� ���� �ݾ��ִ� "]"�� �߰��Ѵ�.
	}
	
	
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


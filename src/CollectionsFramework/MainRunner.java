package CollectionsFramework;

public class MainRunner {
	    public static void main(String[] args)	{
	        ArrayListExex arraylist = new ArrayListExex();	//ArrayList Ŭ������ ���� ��ü�� �����Ͽ� �ּҰ��� ���������� �����Ѵ�.
	        arraylist.addLast(3);	//arraylist ��Ʈ�Ͻ��� ������ �޼��带�� ȣ���Ѵ�.
	        arraylist.addLast(5);
	        arraylist.add(1, 4);
	        arraylist.addFirst(10);

	        System.out.println(arraylist.get(2));
	        System.out.println(arraylist);
	        System.out.println(arraylist.indexOf(3));

	    }
	}
	

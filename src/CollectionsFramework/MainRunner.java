package CollectionsFramework;

public class MainRunner {
	    public static void main(String[] args)	{
	        ArrayListExex arraylist = new ArrayListExex();	//ArrayList 클래스로 부터 객체를 생성하여 주소값을 참조변수에 저장한다.
	        arraylist.addLast(3);	//arraylist 인트턴스에 생성된 메서드를을 호출한다.
	        arraylist.addLast(5);
	        arraylist.add(1, 4);
	        arraylist.addFirst(10);

	        System.out.println(arraylist.get(2));
	        System.out.println(arraylist);
	        System.out.println(arraylist.indexOf(3));

	    }
	}
	

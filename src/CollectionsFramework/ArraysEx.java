package CollectionsFramework;

import java.util.Arrays;	//Arrays 클래스를 사용하기 위해 import 하였다

public class ArraysEx {
	public static void main(String arg [] ) {
		int [] arr = {0, 1, 2, 3, 4,};	//1차원 배열을 생성하고 초기화 한다. arr은 참조변수로 생성된 배열의 주소를 가리킨다.
		int [] [] arr2D = {{11, 12, 13}, {21, 22, 23}};	//2차원 배열을 생성하고 초기화 한다. 마찬가지로 참조변수는 주소를 가리키는데 주소의 1차원배열이 다시 2차원배열의 주소를 가리킨다.
	
		System.out.println("arr = " + Arrays.toString(arr));	//1차원 배열을 출력하는데 사용하는 메서드 toString()
		System.out.println("arr2D = " + Arrays.deepToString(arr2D));	//2차원 배열을 출력할때는 deepToString()메서드를 사용해야된다.
	
		int [] arr2 = Arrays.copyOf(arr, arr.length);	//Arrays 클래스의 copyOf() 메서드를 이용한 배열 복사.밑의 내은 범위를 주느라 추가함
		int [] arr3 = Arrays.copyOf(arr, 3);	//3번째 번지수까지 복사가 아니라 그 전까지이다.
		int [] arr4 = Arrays.copyOf(arr, 7);	//범위를 넘어서는 배열은 0으로 채운다.
		int [] arr5 = Arrays.copyOfRange(arr, 2, 4); //마찬가지로 4번째 번지가 아닌 그 앞까지 배열을 복사한다.
		int [] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2 = " + Arrays.toString(arr2)); //출력
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println("arr4 = " + Arrays.toString(arr4));
		System.out.println("arr5 = " + Arrays.toString(arr5));
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		int [] arr7 = new int[5];	//길이가 5인 배열을 생성하였다 초기화는 기본값 0 인 상태
		Arrays.fill(arr7, 9);	//fill()를 사용하여 배열의 내용을 채우는데 9로 채웠다
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random() * 6) + 1);	//i -> (int)(Math.random() * 6) + 1 가 람다식이라고 하는데 Math.random만 난수 적용인것을 알겠음.
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		for(int i : arr7) {	//향상된 for 문으로 순서대로 돌면서 arr7의 값을 i에 저장한다. 
			char [] graph = new char[i];	//여기서는 문자형 배열 을 선언하고 그 번지에 순차적으로 arr7의 값을 저장한다.
			Arrays.fill(graph, '*'); //graph 가 가리키는 문자형 배열에 주소마다 arr7로 생성된 값만큼 *로 채운다.
			System.out.println(new String(graph) + 1);	//단순히 +1 을 하면서 경계를 둠
		}
		
		String [] [] str2D = new String [] [] {{"aaa", "bbb"},{"AAA", "BBB"}};	//String 타입의 2차원 배열을 생성함. 2차원배열은 행렬같아 보이지만 사실 아님 주소값의 주소값을 가리키는 형태
		String [] [] str2D2 = new String [] [] {{"aaa", "bbb"},{"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));	//배열을 비교하는 메서드로 내용이 같으면 true가 반환되어야 하지만 
		System.out.println(Arrays.deepEquals(str2D, str2D2));	//2차원 배열의 비교는 deepEquals()로 비교해야된다. deepToString과 비슷한 사용
	
		char[] chArr = {'A', 'D', 'C', 'B', 'E'};	//순서를 생각하지 않고 임의로 문자값을 배열에 저장함
		
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));	//binarySearch() 메서드로 chArr의 문자B를 찾아내고 싶지만 오류가 발생한다. 정렬이 되지 않았기 때문.
		System.out.println("== After sorting ==");
		Arrays.sort(chArr);	//배열을 정렬한다. 문자형태도 유니코드로 표현되기 때문에 정렬을 할수있다.
		System.out.println("chArr = " + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));	//순차적으로 정렬이 완료 된 후 binarySearch()로 배열의 번지수를 찾을 수 있다.
		
	}
}

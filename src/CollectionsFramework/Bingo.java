package CollectionsFramework;

import java.util.*;

public class Bingo {

	public static void main(String[] args) {
		Set set = new HashSet();	//Set 타입의 참조변수를 선언하고 여기에 HashSet클래스로부터 인스턴스를 생성한 후 주소값을 저장한다.
		
		int [][] board = new int[5][5];	//int 타입의 크기가 각각 5인 2차원 배열을 생성한 후 참조변수 board에 주소를 저장한다.
		
		for(int i = 0; set.size() < 25; i++) {	//set이 가리키는 인스턴스의 길이만큼 반복한다. 2차원 배열이므로 0번지 0번지~4번지, 1번지~0~4번지 식으로 25번을 반복
			set.add((int)(Math.random()*50)+1 + "");	//set의 인스턴스에 난수값을 저장하는데 1~50까지의 수를 임의로 저장한다.
		}
		
		Iterator it = set.iterator();	// 컬렉션에 저장된 요소를 불러오기 위해 Iterator 타입의 참조변수를 선언하고 set의 iterator() 메서드를 호출하여 저장하였다.
		
		for(int i = 0; i < board.length; i++) {	//1차원 배열의 길이만큼 반복
			for(int j = 0; j <board[i].length; j++) {	//2차원 배열의 길이만큼 반복
				board [i][j] = Integer.parseInt(String.valueOf(it.next())); //it의 next()메서드로 String 값을 읽어오고, 이를 Integer 타입으로 변환하여 board의 인스턴스에 저장한다.
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);  //출력
			}
			System.out.println();
		}

	}

}

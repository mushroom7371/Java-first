package CollectionsFramework;

import java.util.*;

public class Bingo {

	public static void main(String[] args) {
		Set set = new HashSet();	//Set Ÿ���� ���������� �����ϰ� ���⿡ HashSetŬ�����κ��� �ν��Ͻ��� ������ �� �ּҰ��� �����Ѵ�.
		
		int [][] board = new int[5][5];	//int Ÿ���� ũ�Ⱑ ���� 5�� 2���� �迭�� ������ �� �������� board�� �ּҸ� �����Ѵ�.
		
		for(int i = 0; set.size() < 25; i++) {	//set�� ����Ű�� �ν��Ͻ��� ���̸�ŭ �ݺ��Ѵ�. 2���� �迭�̹Ƿ� 0���� 0����~4����, 1����~0~4���� ������ 25���� �ݺ�
			set.add((int)(Math.random()*50)+1 + "");	//set�� �ν��Ͻ��� �������� �����ϴµ� 1~50������ ���� ���Ƿ� �����Ѵ�.
		}
		
		Iterator it = set.iterator();	// �÷��ǿ� ����� ��Ҹ� �ҷ����� ���� Iterator Ÿ���� ���������� �����ϰ� set�� iterator() �޼��带 ȣ���Ͽ� �����Ͽ���.
		
		for(int i = 0; i < board.length; i++) {	//1���� �迭�� ���̸�ŭ �ݺ�
			for(int j = 0; j <board[i].length; j++) {	//2���� �迭�� ���̸�ŭ �ݺ�
				board [i][j] = Integer.parseInt(String.valueOf(it.next())); //it�� next()�޼���� String ���� �о����, �̸� Integer Ÿ������ ��ȯ�Ͽ� board�� �ν��Ͻ��� �����Ѵ�.
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);  //���
			}
			System.out.println();
		}

	}

}

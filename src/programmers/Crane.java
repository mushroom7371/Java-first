package programmers;

import java.util.Stack;

class Crane {
	private int solution(int [][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();	//������ ���� ���� �ٱ���
        
        for(int i = 0; i < moves.length; i++){	//ũ������ �̵� Ƚ�� ��ŭ �ݺ�
            for(int j = 0; j < board.length; j++){	//������ ���̸�ŭ �ݺ�
                if(board[j][moves[i]-1] != 0 ) {  //j���� ũ���� ��ġ ���� ������ �����Ѵٸ�                 
                    if(!stack.empty() && stack.peek() == board[j][moves[i]-1]){	//�ٱ��ϰ� ������� �ʰ�, �� ���� ������ ũ�������� ���� ������ ������
                        answer++;	//������ ���ŵ� Ƚ�� ����
                        stack.pop();	//�ٱ��Ͽ� �ִ� ������ �����ش�
                        board[j][moves[i]-1] = 0;	//ũ�������� ���� ������ �����ش�.
                        break;
                    }else{
                        stack.push(board[j][moves[i]-1]);	//�̿��� ��쿡�� ������ �ٱ��Ϸ� �ű� �� 0���� �����ش�.                 
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                }                        
            }
        }
        
        return answer*2;
    }
}

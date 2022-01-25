package programmers;

import java.util.Stack;

class Crane {
	private int solution(int [][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();	//인형을 담을 스택 바구니
        
        for(int i = 0; i < moves.length; i++){	//크레인의 이동 횟수 만큼 반복
            for(int j = 0; j < board.length; j++){	//격자의 길이만큼 반복
                if(board[j][moves[i]-1] != 0 ) {  //j행의 크레인 위치 열에 인형이 존재한다면                 
                    if(!stack.empty() && stack.peek() == board[j][moves[i]-1]){	//바구니가 비어있지 않고, 맨 위의 인형이 크레인으로 뽑은 인형과 같으면
                        answer++;	//인형이 제거된 횟수 증가
                        stack.pop();	//바구니에 있는 인형은 없애준다
                        board[j][moves[i]-1] = 0;	//크레인으로 뽑은 인형도 없애준다.
                        break;
                    }else{
                        stack.push(board[j][moves[i]-1]);	//이외의 경우에는 인형을 바구니로 옮긴 후 0으로 없애준다.                 
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                }                        
            }
        }
        
        return answer*2;
    }
}

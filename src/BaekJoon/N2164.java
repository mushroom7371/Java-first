package BaekJoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

//카드2
public class N2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfCards = Integer.parseInt(br.readLine());    //카드의 개수
        Queue<Integer> cardQueue = new LinkedList<>();  //Queue 타입의 참조변수가 새로 생성한 LinkedList 객체를 가리키도록 함
        br.close();

        for(int i = 1; i <= numberOfCards; i++){    //1부터 N까지 순차적으로 큐에 저장함. 먼저들어간 1이 맨 위에 있는 상태이다
            cardQueue.offer(i);
        }

        while(cardQueue.size() > 1){
            cardQueue.poll();   //맨 위에 있는 숫자를 제거하고
            int lastNumber = cardQueue.peek();  //그 다음 위에 있는 숫자를 변수에 저장해서
            cardQueue.offer(lastNumber);    //큐에 밀어 넣음, 맨 아래에 위치하게 됨
            cardQueue.poll();   //숫자를 옮겼으니 제거
        }

        bw.write(cardQueue.peek() + "");
        bw.flush();
        bw.close();

    }
}

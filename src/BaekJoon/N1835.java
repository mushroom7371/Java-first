package BaekJoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

//카드
public class N1835 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cardN = Integer.parseInt(br.readLine());    //카드의 수
        Deque<Integer> cardDeque = new LinkedList<>();  //주어진 마술 순서대로 수행하기 위한 Deque
        int [] cardArray = new int[cardN];  //마술이 성공하기 위한 카드 순서를 담을 배열
        int count = 0;  //반복마다 올라갈 카운트

        for(int i = 0; i < cardN; i++){ //덱에 1부터 N까지의 카드를 저장
            cardDeque.add(i + 1);
        }

        while(cardN > 0){   //카드의 개수만큼 반복
            count++;    //1번째 수행시 첫번째 카드를 1번 뒤로 보냄, 2번째 수행시 첫번째 카드를 뒤로 보냄 X2... 를 판단할 변수 세팅

            for(int i = 0; i < count; i++){ //카운트 만큼 반복이 실행됨
                cardDeque.addLast(cardDeque.pollFirst());   //덱의 가장 첫번째 카드를 빼서 가장 뒤로 보낸다
            }

            cardArray[cardDeque.pollFirst() - 1] = count;   //위의 반복이 끝나고 나서 덱의 가장 앞에 놓인 카드가 count가 되어야 함

            cardN--;    //카드 갯수 감소
        }

        for(int i = 0; i < cardArray.length; i++){  //배열에 담긴 순서대로 출력
            bw.write(cardArray[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}

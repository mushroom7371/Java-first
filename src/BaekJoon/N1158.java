package BaekJoon;

import java.io.*;
import java.util.*;

//요세푸스 문제
public class N1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> josephusQueue = new LinkedList<>();  //LinkedList 객체를 통해 큐 구현
        List<Integer> answerList = new ArrayList<>();   //정답이 담길 ArrayList
        int [] inputArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int initSize = inputArray[0];   //사람의 수
        int kTh = inputArray[1];    //제거해야 될 수 K

        for(int i = 0; i < initSize; i++){  //초기 queue 데이터 설정
            josephusQueue.offer(i + 1);
        }

        while(josephusQueue.size() != 0){   //큐에 데이터가 있을때 까지 반복
            for(int i = 0; i < kTh - 1; i++){   //k번재 전까지 반복
                josephusQueue.offer(josephusQueue.peek());  //맨 앞의 데이터를 맨 뒤에 추가하고
                josephusQueue.poll();   //맨 앞의 데이터를 삭제
            }
            answerList.add(josephusQueue.peek());   //K번째 제거할 인원을 저장하고
            josephusQueue.poll();   //K번째 사람을 제거
        }

        for(int i = 0; i < answerList.size(); i++){
            if(answerList.size() == 1){ //입력데이터가 한 개일 경우
                bw.write("<" + answerList.get(i) + ">");
            }else{  //데이터가 여러개 일 경우 양식에 맞춰 출력
                if(i == 0){
                    bw.write("<" + answerList.get(i) + ", ");
                }else if(i == answerList.size() -1){
                    bw.write(answerList.get(i) + ">");
                }else{
                    bw.write(answerList.get(i) + ", ");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}

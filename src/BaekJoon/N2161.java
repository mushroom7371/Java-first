package BaekJoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

//카드1
public class N2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberN = Integer.parseInt(br.readLine());
        Queue<Integer> numberQueue = new LinkedList<>();

        br.close();

        for(int i = 1; i <= numberN; i++){  //큐에 순차적으로 숫자를 저장
            numberQueue.add(i);
        }

        while(numberQueue.size() != 1){ //큐의 크기가 1이되면 반복 종료
            bw.write(numberQueue.peek() + " "); //첫번째 데이터를 버퍼에 기록하고
            numberQueue.remove();   //첫번째 데이터 삭제
            numberQueue.add(numberQueue.peek());    //첫번째 데이터(지우기전 데이터의 다음 데이터)를 큐의 마지막에 저장하고
            numberQueue.remove();   //데이터 삭제
        }

        bw.write(numberQueue.peek() + "");
        bw.flush();
        bw.close();

    }
}

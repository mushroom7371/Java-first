package BaekJoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

//덱
public class N10866 {
    public static void main(String[] args) throws IOException {
        //N10828 스택, N18258 큐 2 와 유사한 구현 문제 다만 앞선 두개는 if로 command를 다뤘으나, 여기선 swith문을 활용했다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();

        for(int i = 0; i < testCase; i++){
            String [] inputArray = br.readLine().split(" ");    //입력된 문자열에서 명령어 뽑아내기, push의 경우 공백을 기준으로 이후 문자가 다룰 숫자가 된다.
            String command = inputArray[0];

            switch (command){
                case "push_front":
                    dq.offerFirst(Integer.parseInt(inputArray[1]));
                    break;
                case "push_back":
                    dq.offerLast(Integer.parseInt(inputArray[1]));
                    break;
                case "pop_front":
                    if(!dq.isEmpty()){
                        bw.write(dq.peekFirst() + "\n");
                        dq.pollFirst();
                    }else{
                        bw.write(-1 + "\n");
                    }
                    break;
                case "pop_back":
                    if(!dq.isEmpty()){
                        bw.write(dq.peekLast() + "\n");
                        dq.pollLast();
                    }else{
                        bw.write(-1 + "\n");
                    }
                    break;
                case "size":
                    bw.write(dq.size() + "\n");
                    break;
                case "empty":
                    if(dq.isEmpty()){
                        bw.write(1 + "\n");
                    }else{
                        bw.write(0 + "\n");
                    }
                    break;
                case "front":
                    if(!dq.isEmpty()){
                        bw.write(dq.peekFirst() + "\n");
                    }else{
                        bw.write(-1 + "\n");
                    }
                    break;
                case "back":
                    if(!dq.isEmpty()){
                        bw.write(dq.peekLast() + "\n");
                    }else{
                        bw.write(-1 + "\n");
                    }
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}

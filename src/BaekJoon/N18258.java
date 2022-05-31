package BaekJoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

//큐 2
public class N18258 {
    public static void main(String[] args) throws IOException {
        //전반적인 내용은 N10828 스택과 매우 유사함.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Queue<Integer> integerQueue = new LinkedList<>();   //일반 배열로 선언하면 추가, 삭제시 배열을 새로 만들기 때문에 오래걸림.LinkedList를 이용하면 각 번지의 데이터가 다음 번지의 데이터를 참조하는 식이므로 삭제, 추가가 용이하다.
        int last = 0;

        for(int i = 0; i < testCase; i++){
            String [] inputArray = br.readLine().split(" ");
            String command = inputArray[0];

            if(command.equals("push")){
                integerQueue.offer(Integer.parseInt(inputArray[1]));
                last = Integer.parseInt(inputArray[1]);
            }else if(command.equals("pop")){
                if(integerQueue.size() == 0){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(integerQueue.peek() + "\n");
                    integerQueue.remove();
                }
            }else if(command.equals("size")){
                bw.write(integerQueue.size() + "\n");
            }else if(command.equals("empty")){
                if(integerQueue.size() == 0){
                    bw.write(1 + "\n");
                }else{
                    bw.write(0 + "\n");
                }
            }else if(command.equals("front")){
                if(integerQueue.size() == 0){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(integerQueue.peek() + "\n");
                }
            }else if(command.equals("back")){
                if(integerQueue.size() == 0){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(last + "\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}

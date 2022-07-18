package BaekJoon;

import java.io.*;
import java.util.*;

//프린터 큐
public class N1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            int index = 1;
            int maxCont = 0;
            st = new StringTokenizer(br.readLine());
            int numberOfDoc = Integer.parseInt(st.nextToken());
            int targetDocIndex = Integer.parseInt(st.nextToken());
            String targetDoc = "";

            Queue<String> priorityQueue = new LinkedList<>();
            int [] arrayForMax = new int[numberOfDoc];

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < numberOfDoc; j++){
                String doc = st.nextToken();

                if(j == targetDocIndex){
                    targetDoc = doc;
                }
                priorityQueue.offer(doc);
                arrayForMax[j] = Integer.parseInt(doc);
            }

            for(int k = 0; k < numberOfDoc; k++){
                if(arrayForMax[k] > Integer.parseInt(targetDoc)){
                    maxCont++;
                }
            }

            while(maxCont > 0){
                int temp = Integer.parseInt(priorityQueue.peek());

                if(Integer.parseInt(targetDoc) >= temp){
                    priorityQueue.offer(priorityQueue.peek());
                    priorityQueue.poll();
                }else{
                    priorityQueue.poll();
                    maxCont--;
                    index++;
                }
            }

            while(true){
                if(targetDoc == priorityQueue.peek()){
                    index++;
                    bw.write(index + "\n");
                    break;
                }else{
                    priorityQueue.offer(priorityQueue.peek());
                    priorityQueue.poll();
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

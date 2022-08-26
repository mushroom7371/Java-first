package BaekJoon;

import java.io.*;
import java.util.*;

//요세푸스 문제 0
public class N11866 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   //인원수
        int K = Integer.parseInt(st.nextToken());   //제거될 K번째 수
        Queue<Integer> josephusQueue = new LinkedList<>();  //앞의 인원을 뒤로 밀어넣는 방식으로 풀 예정으로 FIFO 형태의 Queue 선언

        for(int i = 1; i <= N; i++){    //인숸수 대로 번호를 부여해 큐에 저장
            josephusQueue.offer(i);
        }

        if(N == 1){ //인원수가 1이면
            bw.write("<1>");
        }else{
            while(!josephusQueue.isEmpty()){    //큐에 데이터가 남아있을때 까지 반복
                for(int i = 1; i < K; i++){ //K번째 인원이 맨 앞으로 오도록 반복
                    josephusQueue.offer(josephusQueue.poll());  //큐의 맨 뒤에 헤드의 요소를 저장하고 제거
                }

                if(josephusQueue.size() == N){  //출력 형태를 맞추기 위한 if문, K번째 인원인 헤드의 데이터를 버퍼에 기록한다.
                    bw.write("<" + josephusQueue.poll() + ", ");
                }else if(josephusQueue.size() == 1){
                    bw.write(josephusQueue.poll() + ">");
                }else{
                    bw.write(josephusQueue.poll() + ", ");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        new N11866().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//단순한 문제(Small)
public class N25494 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            int count = 0;

            for(int i = 1; i <= x; i++){
                for(int j = 1; j <= y; j++){
                    for(int k = 1; k <= z; k++){
                        if(i % j == j % k && j % k == k % i){
                            count++;
                        }
                    }
                }
            }

            bw.write(count + "\n");
            testCase--;
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N25494().solution();
    }
}

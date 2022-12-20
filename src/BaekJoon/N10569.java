package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//다면체
public class N10569 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while(testCase --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numberOfVertex = Integer.parseInt(st.nextToken());
            int numberOfCorner = Integer.parseInt(st.nextToken());

            bw.write(2 + numberOfCorner - numberOfVertex + "\n");   //면의 수를 구하는 수식
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N10569().solution();
    }
}

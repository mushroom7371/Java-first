package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//할로윈의 사탕
public class N10178 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (testCase --> 0){
            st = new StringTokenizer(br.readLine());
            int numberOfCandy = Integer.parseInt(st.nextToken());
            int brothers = Integer.parseInt(st.nextToken());

            bw.write("You get " + numberOfCandy/brothers + " piece(s) and your dad gets " + numberOfCandy%brothers + " piece(s).\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10178().solution();
    }
}

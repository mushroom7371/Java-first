package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//고려대학교에는 공식 와인이 있다
public class N16673 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        long sum = 0;

        for (int i = 1; i <= C; i++) {
            sum += K*i + P*i*i;
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16673().solution();
    }
}

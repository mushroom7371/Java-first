package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//오버플로우와 모듈러
public class N15818 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= Integer.parseInt(st.nextToken());
            result %= m;
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15818().solution();
    }
}

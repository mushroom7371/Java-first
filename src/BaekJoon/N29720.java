package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//그래서 님 푼 문제 수가?
public class N29720 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int min = n - (m * k);
        int max = n - (k -1) * m - 1;

        if (min < 0) {
            min = 0;
        }

        bw.write(min + " " + max);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29720().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//괴짜 교수
public class N11109 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            int x = d + (n * p);
            int y = n * s;

            if (x > y) {
                bw.write("do not parallelize\n");
            } else if (x < y) {
                bw.write("parallelize\n");
            } else {
                bw.write("does not matter\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11109().solution();
    }
}

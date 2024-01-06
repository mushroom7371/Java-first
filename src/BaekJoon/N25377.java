package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//빵
public class N25377 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfBakery = Integer.parseInt(br.readLine());

        int result = Integer.MAX_VALUE;
        while (numberOfBakery --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a <= b) {
                result = Math.min(result, b);
            }
        }

        if (result == Integer.MAX_VALUE) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(result));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25377().solution();
    }
}

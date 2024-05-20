package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Triathlon
public class N25600 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int max = 0;
        while (n --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());

            int score = a * (d + g);
            if (a == (d + g)) {
                score *= 2;
            }

            max = Math.max(max, score);
        }

        bw.write(max + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25600().solution();
    }
}

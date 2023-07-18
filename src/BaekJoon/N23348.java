package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//스트릿 코딩 파이터
public class N23348 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int oneHandCodingScore = Integer.parseInt(st.nextToken());
        int noLookCodingScore = Integer.parseInt(st.nextToken());
        int phoneCodingScore = Integer.parseInt(st.nextToken());

        int testCase = Integer.parseInt(br.readLine());
        int max = 0;

        while (testCase --> 0) {
            int score = 0;
            for (int i = 0; i < 3; i++) {
                st = new StringTokenizer(br.readLine());
                int oneHandCoding = Integer.parseInt(st.nextToken());
                int noLookCoding = Integer.parseInt(st.nextToken());
                int phoneCoding = Integer.parseInt(st.nextToken());

                score += oneHandCodingScore * oneHandCoding + noLookCodingScore * noLookCoding + phoneCodingScore * phoneCoding;
            }

            if (score > max) {
                max = score;
            }
        }

        bw.write(String.valueOf(max));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23348().solution();
    }
}

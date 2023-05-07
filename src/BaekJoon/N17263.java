package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Sort 마스터 배지훈
public class N17263 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;

        for (int i = 0; i < testCase; i++) {
            int number = Integer.parseInt(st.nextToken());

            if (max <= number) {
                max = number;
            }
        }

        bw.write(max + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17263().solution();
    }
}

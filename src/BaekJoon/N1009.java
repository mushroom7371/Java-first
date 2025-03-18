package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//분산처리
public class N1009 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        int[][] infoArr = {
                {1, 1, 1, 1},
                {2, 4, 8, 6},
                {3, 9, 7, 1},
                {4, 6, 4, 6},
                {5, 5, 5, 5},
                {6, 6, 6, 6},
                {7, 9, 3, 1},
                {8, 4, 2, 6},
                {9, 1, 9, 1},
                {10, 10, 10, 10}
        };

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) % 10;
            int b = Integer.parseInt(st.nextToken()) % 4;

            if (a == 0) {
                a = 10;
            }
            if (b == 0) {
                b = 4;
            }

            bw.write(infoArr[a-1][b-1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1009().solution();
    }
}

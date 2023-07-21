package BaekJoon;

import java.io.*;

//중앙 이동 알고리즘
public class N2903 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int targetNumber = Integer.parseInt(br.readLine());
        int[] initialPoints = new int[16];

        int numberOfPoint = 2;
        for (int i = 1; i <= 15; i++) {
            numberOfPoint = numberOfPoint * 2 - 1;
            initialPoints[i] = numberOfPoint;
        }

        int result = initialPoints[targetNumber] * initialPoints[targetNumber];
        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2903().solution();
    }
}

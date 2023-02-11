package BaekJoon;

import java.io.*;
import java.util.Arrays;

//콘테스트
public class N5576 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] universityW = new int[10];
        int [] universityK = new int[10];

        for (int i = 0; i < 10; i++) {
            universityW[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 10; i++) {
            universityK[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(universityW);
        Arrays.sort(universityK);

        int sumW = universityW[7] + universityW[8] + universityW[9];
        int sumK = universityK[7] + universityK[8] + universityK[9];

        bw.write(sumW + " " + sumK);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5576().solution();
    }
}

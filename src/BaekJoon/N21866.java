package BaekJoon;

import java.io.*;
import java.util.Arrays;

//추첨을 통해 커피를 받자
public class N21866 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] initScore = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        int[] score = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = 0;
        boolean isCheating = false;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > initScore[i]) {
                isCheating = true;
                break;
            }
            result += score[i];
        }

        if (isCheating) {
            bw.write("hacker");
        } else {
            if (result >= 100) {
                bw.write("draw");
            } else {
                bw.write("none");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N21866().solution();
    }
}

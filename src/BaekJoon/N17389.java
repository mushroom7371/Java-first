package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//보너스 점수
public class N17389 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfQuestion = Integer.parseInt(br.readLine());
        String[] answer = br.readLine().split("");
        int score = 0;
        int bonus = 0;

        for (int i = 0; i < numberOfQuestion; i++) {
            if (answer[i].equals("O")) {
                score += i + 1 + bonus;
                bonus++;
            } else {
                bonus = 0;
            }
        }

        bw.write(String.valueOf(score));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17389().solution();
    }
}

package BaekJoon;

import java.io.*;

//체스 초보 브실이
public class N29725 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int score = 0;

        for (int i = 0; i < 8; i++) {
            String input = br.readLine();
            for (int j = 0; j < 8; j++) {
                char c = input.charAt(j);

                if (c == 'p') {
                    score -= 1;
                } else if (c == 'P') {
                    score += 1;
                } else if (c == 'n') {
                    score -= 3;
                } else if (c == 'N') {
                    score += 3;
                } else if (c == 'b') {
                    score -= 3;
                } else if (c == 'B') {
                    score += 3;
                } else if (c == 'r') {
                    score -= 5;
                } else if (c == 'R') {
                    score += 5;
                } else if (c == 'q') {
                    score -= 9;
                } else if (c == 'Q') {
                    score += 9;
                }
            }
        }

        bw.write(score + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29725().solution();
    }
}

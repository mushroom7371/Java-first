package BaekJoon;

import java.io.*;

//탁구 경기
public class N27918 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfRounds = Integer.parseInt(br.readLine());

        int dalGuScore = 0;
        int ponixScore = 0;
        while (numberOfRounds-- > 0) {
            String winner = br.readLine();

            if (winner.equals("D")) {
                dalGuScore += 1;
            } else {
                ponixScore += 1;
            }

            if (Math.abs(dalGuScore - ponixScore) >= 2) {
                break;
            }
        }

        bw.write(String.format("%d:%d", dalGuScore, ponixScore));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27918().solution();
    }
}

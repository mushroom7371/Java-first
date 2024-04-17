package BaekJoon;

import java.io.*;

//개표
public class N30868 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfCandidate = Integer.parseInt(br.readLine());

        while (numberOfCandidate --> 0) {
            int numberOfVote = Integer.parseInt(br.readLine());
            int quotient = numberOfVote / 5;
            int remainder = numberOfVote % 5;

            for (int i = 0; i < quotient; i++) {
                bw.write("++++ ");
            }

            for (int i = 0; i < remainder; i++) {
                bw.write("|");
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30868().solution();
    }
}

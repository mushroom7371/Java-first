package BaekJoon;

import java.io.*;

//인생 점수
public class N15351 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            char[] inputCharArray = br.readLine().toCharArray();
            int result = 0;

            for (char c : inputCharArray) {
                if (c != ' ') {
                    result += c - 64;
                }
            }

            if (result == 100) {
                bw.write("PERFECT LIFE\n");
            } else {
                bw.write(String.valueOf(result) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15351().solution();
    }
}

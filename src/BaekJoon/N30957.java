package BaekJoon;

import java.io.*;

//빅데이터 vs 정보보호 vs 인공지능
public class N30957 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int countB = 0;
        int countS = 0;
        int countA = 0;

        for (int i = 0; i < n; i++) {
            char c = input.charAt(i);
            if (c == 'B') {
                countB++;
            } else if (c == 'S') {
                countS++;
            } else if (c == 'A') {
                countA++;
            }
        }

        int max = Math.max(countB, Math.max(countS, countA));

        if (countB == countS && countS == countA) {
            bw.write("SCU");
        } else {
             if (countB == max) {
                bw.write("B");
            }

             if (countS == max) {
                bw.write("S");
             }

             if (countA == max) {
                bw.write("A");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30957().solution();
    }
}

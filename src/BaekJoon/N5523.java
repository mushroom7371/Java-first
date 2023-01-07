package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//경기 결과
public class N5523 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());
        int winCountOfA = 0;
        int winCountOfB = 0;

        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine());
            int scoreOfA = Integer.parseInt(st.nextToken());
            int scoreOfB = Integer.parseInt(st.nextToken());

            if (scoreOfA > scoreOfB) {
                winCountOfA++;
            } else if (scoreOfA < scoreOfB) {
                winCountOfB++;
            }
        }

        bw.write(winCountOfA + " " + winCountOfB);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5523().solution();
    }
}

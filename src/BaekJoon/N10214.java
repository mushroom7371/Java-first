package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Baseball
public class N10214 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (testCase --> 0) {
            int yonSeiScore = 0;
            int koreaScore = 0;

            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine());
                yonSeiScore += Integer.parseInt(st.nextToken());
                koreaScore += Integer.parseInt(st.nextToken());
            }

            if (yonSeiScore > koreaScore) {
                bw.write("Yonsei\n");
            } else if (yonSeiScore < koreaScore) {
                bw.write("Korea\n");
            } else {
                bw.write("Draw\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10214().solution();
    }
}

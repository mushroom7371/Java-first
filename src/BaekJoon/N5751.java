package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Head or Tail
public class N5751 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int testCase = Integer.parseInt(br.readLine());
            if (testCase == 0) {
                break;
            }

            int maryCount = 0;
            int johnCount = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < testCase; i++) {
                if (st.nextToken().equals("0")) {
                    maryCount++;
                } else {
                    johnCount++;
                }
            }

            bw.write("Mary won " + maryCount + " times and John won " + johnCount + " times\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5751().solution();
    }
}

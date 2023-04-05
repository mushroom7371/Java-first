package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//윷놀이
public class N2490 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = 3;

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numberOfZero = 0;

            while (st.hasMoreTokens()) {
                int number = Integer.parseInt(st.nextToken());

                if (number == 0) {
                    numberOfZero++;
                }
            }

            if (numberOfZero == 1) {
                bw.write("A\n");
            } else if (numberOfZero == 2) {
                bw.write("B\n");
            } else if (numberOfZero == 3) {
                bw.write("C\n");
            } else if (numberOfZero == 4) {
                bw.write("D\n");
            } else {
                bw.write("E\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2490().solution();
    }
}

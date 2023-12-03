package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//생장점
public class N1703 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int testCase = Integer.parseInt(st.nextToken());
            if (testCase == 0) {
                break;
            }

            int result = 1;
            for (int i = 0; i < 2 * testCase; i++) {
                int number = Integer.parseInt(st.nextToken());
                if (i % 2 == 0) {
                    result *= number;
                } else {
                    result -= number;
                }
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1703().solution();
    }
}

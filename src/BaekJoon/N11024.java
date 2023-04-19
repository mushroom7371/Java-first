package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//더하기 4
public class N11024 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;

            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }

            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11024().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//A+B - 6
public class N10953 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ",");
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10953().solution();
    }
}

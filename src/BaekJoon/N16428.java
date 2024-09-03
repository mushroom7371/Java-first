package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Angles
public class N16428 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a + b + c == 180) {
                bw.write(a + " " + b + " " + c + " " + "Seems OK\n");
            } else {
                bw.write(a + " " + b + " " + c + " " + "Check\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16428().solution();
    }
}

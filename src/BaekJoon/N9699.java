package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//RICE SACK
public class N9699 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = 0;

            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                if (max < num) {
                    max = num;
                }
            }

            bw.write("Case #" + i + ": " + max + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9699().solution();
    }
}

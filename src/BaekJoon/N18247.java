package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//겨울왕국 티켓 예매
public class N18247 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n < 12 || m < 4) {
                bw.write("-1\n");
                continue;
            }

            int count = 11 * m + 4;
            bw.write(count + "\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N18247().solution();
    }
}

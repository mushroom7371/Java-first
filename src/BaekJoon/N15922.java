package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//아우으 우아으이야!!
public class N15922 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalLength = 0;
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        for (int i = 0; i < testCase-1; i++) {
            st = new StringTokenizer(br.readLine());
            int tempStart = Integer.parseInt(st.nextToken());
            int tempEnd = Integer.parseInt(st.nextToken());

            if (tempStart <= end) {
                if (tempEnd > end) {
                    end = tempEnd;
                }
            } else {
                totalLength += end - start;
                start = tempStart;
                end = tempEnd;
            }
        }

        bw.write(totalLength + end - start + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15922().solution();
    }
}

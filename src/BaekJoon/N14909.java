package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//양수 개수 세기
public class N14909 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        while (st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());

            if (number > 0) {
                count++;
            }
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14909().solution();
    }
}

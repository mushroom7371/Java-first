package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//거꾸로 구구단
public class N13410 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = 0;

        for (int i = 1; i <= k; i++) {
            String temp = String.valueOf(n * i);
            StringBuilder sb = new StringBuilder();

            for (int j = temp.length() - 1; j >= 0; j--) {
                sb.append(temp.charAt(j));
            }

            int tempNumber = Integer.parseInt(String.valueOf(sb));

            if (max <= tempNumber) {
                max = tempNumber;
            }
        }

        bw.write(max + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13410().solution();
    }
}

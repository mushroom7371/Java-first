package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//3대 측정
public class N20299 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());

            if (a1 + a2 + a3 >= k && a1 >= l && a2 >= l && a3 >= l) {
                count++;
                sb.append(a1).append(" ").append(a2).append(" ").append(a3).append(" ");
            }
        }

        bw.write(count + "\n");
        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N20299().solution();
    }
}

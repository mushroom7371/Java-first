package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//The fellowship of the ring
public class N10406 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int count = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < p; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (x >= w && x <= n) {
                count++;
            }
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10406().solution();
    }
}

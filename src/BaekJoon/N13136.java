package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Do Not Touch Anything
public class N13136 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int row = r / n;
        if (r % n != 0) {
            row++;
        }

        int col = c / n;
        if (c % n != 0) {
            col++;
        }

        bw.write((long) row * col + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13136().solution();
    }
}

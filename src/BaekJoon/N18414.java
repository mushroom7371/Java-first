package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//X に最も近い値 (The Nearest Value)
public class N18414 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        if (x >= l && x <= r) {
            bw.write(x + "");
        } else if (x < l) {
            bw.write(l + "");
        } else {
            bw.write(r + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N18414().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//샤틀버스
public class N25625 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        if (y > x) {
            bw.write(y - x + "");
        } else {
            bw.write(y + x + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25625().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//단원평가
public class N31798 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (c == 0) {
            bw.write((int)Math.sqrt(a + b) + "");
        } else {
            bw.write((c * c - a - b) + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31798().solution();
    }
}

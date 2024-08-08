package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//計算 (Calculation)
public class N24075 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int plus = a + b;
        int minus = a - b;

        if (plus > minus) {
            bw.write(plus + "\n" + minus);
        } else {
            bw.write(minus + "\n" + plus);
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N24075().solution();
    }
}

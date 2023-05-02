package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//덧셈과 곱셈
public class N14579 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int result = 1;

        for (int i = a; i <= b; i++) {
            result *= i*(i+1)/2;
            result %= 14579;
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14579().solution();
    }
}

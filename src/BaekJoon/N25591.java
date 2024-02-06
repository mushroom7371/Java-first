package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//푸앙이와 종윤이
public class N25591 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstNumber = Integer.parseInt(st.nextToken());
        int secondNumber = Integer.parseInt(st.nextToken());

        int a = 100 - firstNumber;
        int b = 100 - secondNumber;
        int c = 100 - (a + b);
        int d = a * b;
        int q = d / 100;
        int r = d % 100;

        bw.write(a + " " + b + " " + c + " " + d + " " + q + " " + r + "\n");

        int first = c;
        int second = d;
        if (d >= 100) {
            first = c + q;
            second = r;
        }

        bw.write(first + " " + second);

        br.close();
        bw.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25591().solution();
    }
}

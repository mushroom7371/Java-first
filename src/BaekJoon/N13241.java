package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class N13241 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if (a > b) {
            bw.write(a * b / gcd(a, b) + "\n");
        } else if (a < b) {
            bw.write(a * b / gcd(b, a) + "\n");
        } else {
            bw.write(a + "\n");
        }

        br.close();
        bw.flush();
        bw.flush();
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        new N13241().solution();
    }
}

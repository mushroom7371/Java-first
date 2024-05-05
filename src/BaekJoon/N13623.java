package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Zero or One
public class N13623 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && b == c) {
            bw.write("*");
        } else if (a == b && b != c) {
            bw.write("C");
        } else if (a == c && b != c) {
            bw.write("B");
        } else if (b == c && a != c) {
            bw.write("A");
        } else {
            bw.write("*");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13623().solution();
    }
}

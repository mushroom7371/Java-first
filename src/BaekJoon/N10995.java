package BaekJoon;

import java.io.*;

//별 찍기 - 20
public class N10995 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < input * 2; i++) {
            if (i % 2 == 1) {
                odd.append(" *");
            } else {
                even.append("* ");
            }
        }

        for (int i = 0; i < input; i++) {
            if (i % 2 == 1) {
                bw.write(odd + "\n");
            } else {
                bw.write(even + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10995().solution();
    }
}

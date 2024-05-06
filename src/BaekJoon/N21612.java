package BaekJoon;

import java.io.*;

//Boiling Water
public class N21612 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int b = Integer.parseInt(br.readLine());

        int p = 5 * b - 400;
        bw.write(p + "\n");

        if (p > 100) {
            bw.write("-1");
        } else if (p < 100) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N21612().solution();
    }
}

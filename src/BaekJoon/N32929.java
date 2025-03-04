package BaekJoon;

import java.io.*;

public class N32929 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int strLength = Integer.parseInt(br.readLine());
        int index = strLength % 3;

        if (index == 1) {
            bw.write("U");
        } else if (index == 2) {
            bw.write("O");
        } else {
            bw.write("S");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32929().solution();
    }
}

package BaekJoon;

import java.io.*;

//구구단표
public class N32710 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        boolean isGuGu = false;

        for (int i = 2; i <= 9; i++) {
            if (n % i == 0 && n / i <= 9) {
                isGuGu = true;
                break;
            }
        }

        if (n > 81) {
            isGuGu = false;
        } else if (n == 1) {
            isGuGu = true;
        }

        if (isGuGu) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32710().solution();
    }
}

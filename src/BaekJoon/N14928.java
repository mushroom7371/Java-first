package BaekJoon;

import java.io.*;

//큰 수(BIG)
public class N14928 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String number = br.readLine();

        long remainder = 0;
        for (int i = 0; i < number.length(); i++) {
            remainder = (remainder * 10 + (number.charAt(i) - '0')) % 20000303;
        }

        bw.write(remainder + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14928().solution();
    }
}

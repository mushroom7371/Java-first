package BaekJoon;

import java.io.*;

//2진수 8진수
public class N1373 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder input = new StringBuilder(br.readLine());

        if (input.length() % 3 == 1) {
            input.insert(0, "00");
        } else if (input.length() % 3 == 2) {
            input.insert(0, "0");
        }

        for (int i = 0; i < input.length(); i += 3) {
            int result = 0;
            if (input.charAt(i) == '1') {
                result += 4;
            }

            if (input.charAt(i + 1) == '1') {
                result += 2;
            }

            if (input.charAt(i + 2) == '1') {
                result += 1;
            }

            bw.write(String.valueOf(result));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1373().solution();
    }
}

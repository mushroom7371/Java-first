package BaekJoon;

import java.io.*;

//디지털 루트
public class N6378 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();

            if (input.equals("0")) {
               break;
            }

            while (input.length() != 1) {
                int number = 0;
                for (int i = 0; i < input.length(); i++) {
                    number += input.charAt(i) - '0';
                }
                input = String.valueOf(number);
            }

            bw.write(input + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6378().solution();
    }
}

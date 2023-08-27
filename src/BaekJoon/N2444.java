package BaekJoon;

import java.io.*;

//별 찍기 - 7
public class N2444 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfLine = Integer.parseInt(br.readLine());

        for (int i = 1; i <= numberOfLine; i++) {
            for (int j = 0; j < numberOfLine - i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        for (int i = numberOfLine - 1; i > 0; i--) {
            for (int j = 0; j < numberOfLine - i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2444().solution();
    }
}

package BaekJoon;

import java.io.*;

//별 찍기 - 9
public class N2446 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < 2 * (number - i) - 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        for (int i = 1; i < number; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2446().solution();
    }
}

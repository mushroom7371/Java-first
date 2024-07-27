package BaekJoon;

import java.io.*;

//Lucky 7
public class N30224 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String strNumber = br.readLine();

        if (strNumber.contains("7")) {
            int number = Integer.parseInt(strNumber);
            if (number % 7 == 0) {
                bw.write("3");
            } else {
                bw.write("2");
            }
        } else {
            int number = Integer.parseInt(strNumber);
            if (number % 7 == 0) {
                bw.write("1");
            } else {
                bw.write("0");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30224().solution();
    }
}

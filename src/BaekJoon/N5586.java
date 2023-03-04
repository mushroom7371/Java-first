package BaekJoon;

import java.io.*;

//JOI와 IOI
public class N5586 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int numberOfJoi = 0;
        int numberOfIoi = 0;

        for (int i = 0; i < input.length() - 2; i++) {
            String temp = input.substring(i, i+3);

            if (temp.equals("JOI")) {
                numberOfJoi++;
            }

            if (temp.equals("IOI")) {
                numberOfIoi++;
            }
        }

        bw.write(numberOfJoi + "\n" + numberOfIoi);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5586().solution();
    }
}

package BaekJoon;

import java.io.*;

//Hot Dogs
public class N5666 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input == null) {
                break;
            }

            String[] temp = input.split(" ");
            int h = Integer.parseInt(temp[0]);
            int p = Integer.parseInt(temp[1]);

            double result = (double) h / p;
            bw.write(String.format("%.2f", result) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5666().solution();
    }
}

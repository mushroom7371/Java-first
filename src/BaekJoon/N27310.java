package BaekJoon;

import java.io.*;

//:chino_shock:
public class N27310 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int length = input.length();
        int numberOfColon = 0;
        int numberOfUnderbar = 0;

        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == ':') {
                numberOfColon++;
            } else if (input.charAt(i) == '_') {
                numberOfUnderbar++;
            }
        }

        int result = length + numberOfColon + numberOfUnderbar * 5;

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27310().solution();
    }
}

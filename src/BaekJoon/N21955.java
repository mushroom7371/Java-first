package BaekJoon;

import java.io.*;

//Split
public class N21955 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String number = br.readLine();
        int length = number.length();
        int half = length / 2;

        bw.write(number.substring(0, half) + " " + number.substring(half));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N21955().solution();
    }
}

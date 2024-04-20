package BaekJoon;

import java.io.*;

//연세여 사랑한다
public class N25915 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        int str = input.charAt(0);
        int i = "I".charAt(0);

        bw.write((Math.abs(str - i) + 84) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25915().solution();
    }
}

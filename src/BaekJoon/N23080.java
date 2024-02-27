package BaekJoon;

import java.io.*;

//스키테일 암호
public class N23080 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int stickThickness = Integer.parseInt(br.readLine());
        String input = br.readLine();

        for (int i = 0; i < input.length(); i += stickThickness) {
            bw.write(input.charAt(i));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23080().solution();
    }
}

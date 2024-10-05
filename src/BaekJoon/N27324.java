package BaekJoon;

import java.io.*;

//ゾロ目 (Same Numbers)
public class N27324 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        if (input.charAt(0) == input.charAt(1)) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27324().solution();
    }
}

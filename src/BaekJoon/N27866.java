package BaekJoon;

import java.io.*;

//문자와 문자열
public class N27866 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int targetIndex = Integer.parseInt(br.readLine()) - 1;

        bw.write(input.charAt(targetIndex) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27866().solution();
    }
}

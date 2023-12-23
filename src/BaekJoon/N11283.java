package BaekJoon;

import java.io.*;

//한글 2
public class N11283 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        bw.write(String.valueOf(input.charAt(0) - 44031));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11283().solution();
    }
}

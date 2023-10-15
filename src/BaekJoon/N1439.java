package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//뒤집기
public class N1439 {

    void solution() throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringTokenizer zeroToken = new StringTokenizer(input, "1");
        StringTokenizer oneToken = new StringTokenizer(input, "0");

        bw.write(String.valueOf(Math.min(zeroToken.countTokens(), oneToken.countTokens())));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1439().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//제리와 톰
public class N16430 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numerator = Integer.parseInt(st.nextToken()); //분자
        int denominator = Integer.parseInt(st.nextToken());    //분모

        numerator = denominator - numerator;

        bw.write(numerator + " " + denominator);
        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N16430().solution();
    }
}

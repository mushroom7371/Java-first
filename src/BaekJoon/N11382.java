package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//꼬마 정민
public class N11382 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long numberA = Long.parseLong(st.nextToken());
        long numberB = Long.parseLong(st.nextToken());
        long numberC = Long.parseLong(st.nextToken());

        bw.write(numberA + numberB + numberC + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11382().solution();
    }
}

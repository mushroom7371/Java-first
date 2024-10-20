package BaekJoon;

import java.io.*;

//分 (Minutes)
public class N31614 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int hour = Integer.parseInt(br.readLine());
        int minute = Integer.parseInt(br.readLine());

        int totalMinute = hour * 60 + minute;
        bw.write(totalMinute + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31614().solution();
    }
}

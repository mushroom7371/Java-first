package BaekJoon;

import java.io.*;

//時間 (Hour)
public class N27327 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int day = Integer.parseInt(br.readLine());
        int hour = day * 24;

        bw.write(hour + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27327().solution();
    }
}

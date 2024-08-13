package BaekJoon;

import java.io.*;

//11 月 (November)
public class N27332 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int day = Integer.parseInt(br.readLine());
        int week = Integer.parseInt(br.readLine());

        if (day + week * 7 > 30) {
            bw.write("0");
        } else {
            bw.write("1");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27332().solution();
    }
}

package BaekJoon;

import java.io.*;

//심부름 가는 길
public class N5554 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int second = 0;

        for (int i = 0; i < 4; i++) {
            second += Integer.parseInt(br.readLine());
        }

        int resultMinute = second / 60;
        int resultSecond = second % 60;

        bw.write(resultMinute + "\n" + resultSecond);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5554().solution();
    }
}

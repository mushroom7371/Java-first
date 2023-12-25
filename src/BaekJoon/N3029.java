package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//경고
public class N3029 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer now = new StringTokenizer(br.readLine(), ":");
        StringTokenizer target = new StringTokenizer(br.readLine(), ":");

        int nowTime = Integer.parseInt(now.nextToken()) * 3600 + Integer.parseInt(now.nextToken()) * 60 + Integer.parseInt(now.nextToken());
        int targetTime = Integer.parseInt(target.nextToken()) * 3600 + Integer.parseInt(target.nextToken()) * 60 + Integer.parseInt(target.nextToken());
        int result = targetTime - nowTime;

        if (result < 0) {
            result += 24 * 3600;
        }

        int hour = result / 3600;
        int minute = (result % 3600) / 60;
        int second = (result % 3600) % 60;

        if (result == 0) {
            bw.write("24:00:00");
        } else {
            bw.write(String.format("%02d:%02d:%02d", hour, minute, second));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N3029().solution();
    }
}

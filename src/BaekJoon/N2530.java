package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//인공지능 시계
public class N2530 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken())*3600;
        int minute = Integer.parseInt(st.nextToken())*60;
        int second = Integer.parseInt(st.nextToken());
        int needToCookSecond = Integer.parseInt(br.readLine());
        int timeToSecond = hour + minute + second + needToCookSecond;

        hour = timeToSecond/3600;
        timeToSecond %= 3600;
        minute = timeToSecond/60;
        second = timeToSecond%60;

        bw.write(changeSecondToTime(hour, minute, second));

        br.close();
        bw.flush();
        bw.close();
    }

    String changeSecondToTime(int hour, int minute, int second) {
        if (second >= 60) {
            minute += 1;
            second -= 60;
        }

        if (minute >= 60) {
            hour += 1;
            second -= 60;
        }

        hour %= 24;

        return hour + " " + minute + " " + second;
    }

    public static void main(String[] args) throws IOException {
        new N2530().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//타임카드
public class N5575 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int startHour = Integer.parseInt(st.nextToken());
            int startMinute = Integer.parseInt(st.nextToken());
            int startSecond = Integer.parseInt(st.nextToken());
            int endHour = Integer.parseInt(st.nextToken());
            int endMinute = Integer.parseInt(st.nextToken());
            int endSecond = Integer.parseInt(st.nextToken());

            int resultHour = endHour - startHour;
            int resultMinute = endMinute - startMinute;
            int resultSecond = endSecond - startSecond;

            if (resultSecond < 0) {
                resultSecond += 60;
                resultMinute--;
            }

            if (resultMinute < 0) {
                resultMinute += 60;
                resultHour--;
            }

            bw.write(resultHour + " " + resultMinute + " " + resultSecond + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5575().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//전화 요금
public class N3226 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int sum = 0;

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] time = st.nextToken().split(":");
            int hour = Integer.parseInt(time[0]);
            int minute = Integer.parseInt(time[1]);
            int dd = Integer.parseInt(st.nextToken());

            for (int i = 0; i < dd; i++) {
                minute++;
                if (hour >= 7 && hour < 19) {
                    sum += 10;
                } else {
                    sum += 5;
                }
                if (minute >= 60) {
                    minute = 0;
                    hour++;
                }
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N3226().solution();
    }
}

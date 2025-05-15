package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//당구 좀 치자 제발
public class N32642 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int day = Integer.parseInt(br.readLine());
        long sum = 0;

        int ragePoint = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < day; i++) {
            int weather = Integer.parseInt(st.nextToken());
            if (weather == 1) {
                ragePoint++;
            } else {
                ragePoint--;
            }

            sum += ragePoint;
        }

        bw.write(String.valueOf(sum));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32642().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class N14541 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine().replaceAll(" ", "");
            int n = Integer.parseInt(input);
            if (n == -1) {
                break;
            }

            StringTokenizer st = new StringTokenizer(br.readLine());
            int speed = Integer.parseInt(st.nextToken());
            int hour = Integer.parseInt(st.nextToken());
            int sum = speed * hour;

            for (int i = 0; i < n - 1; i++) {
                st = new StringTokenizer(br.readLine());
                int speed2 = Integer.parseInt(st.nextToken());
                int hour2 = Integer.parseInt(st.nextToken());
                sum += speed2 * (hour2 - hour);
                hour = hour2;
            }

            bw.write(sum + " miles\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14541().solution();
    }
}

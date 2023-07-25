package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//대지
public class N9063 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int minX = 100000;
        int minY = 100000;
        int maxX = -100000;
        int maxY = -100000;

        StringTokenizer st;
        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x < minX) {
                minX = x;
            }
            if (x > maxX) {
                maxX = x;
            }
            if (y < minY) {
                minY = y;
            }
            if (y > maxY) {
                maxY = y;
            }
        }

        bw.write(String.valueOf((maxX - minX) * (maxY - minY)));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9063().solution();
    }
}

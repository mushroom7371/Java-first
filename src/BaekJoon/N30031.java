package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//지폐 세기
public class N30031 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int paper = Integer.parseInt(br.readLine());

        int sum = 0;
        while (paper --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            if (height == 68) {
                if (width == 136) {
                    sum += 1000;
                } else if (width == 142) {
                    sum += 5000;
                } else if (width == 148) {
                    sum += 10000;
                } else if (width == 154) {
                    sum += 50000;
                }
            }
        }

        bw.write(String.valueOf(sum));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30031().solution();
    }
}

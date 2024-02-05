package BaekJoon;

import java.io.*;

//체육은 코딩과목 입니다
public class N28295 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int direction = 1080;

        for (int i = 0; i < 10; i++) {
            int order = Integer.parseInt(br.readLine());

            if (order == 1) {
                direction += 90;
            } else if (order == 2) {
                direction += 180;
            } else if (order == 3) {
                direction -= 90;
            }
        }

        direction /= 90;
        direction %= 4;

        if (direction == 0) {
            bw.write("N");
        } else if (direction == 1) {
            bw.write("E");
        } else if (direction == 2) {
            bw.write("S");
        } else if (direction == 3) {
            bw.write("W");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28295().solution();
    }
}

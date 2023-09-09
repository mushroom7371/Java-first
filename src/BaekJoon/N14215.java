package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//세 막대
public class N14215 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstStick = Integer.parseInt(st.nextToken());
        int secondStick = Integer.parseInt(st.nextToken());
        int thirdStick = Integer.parseInt(st.nextToken());

        int max = 0;
        if (firstStick > secondStick) {
            if (secondStick > thirdStick) {
                max = firstStick;
            } else {
                max = (firstStick > thirdStick) ? firstStick : thirdStick;
            }
        } else {
            max = (secondStick > thirdStick) ? secondStick : thirdStick;
        }

        if (firstStick + secondStick + thirdStick - max > max) {
            bw.write(firstStick + secondStick + thirdStick + "");
        } else {
            bw.write(((firstStick + secondStick + thirdStick - max) *2 -1) + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14215().solution();
    }
}

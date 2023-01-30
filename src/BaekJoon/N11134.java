package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//쿠키애호가
public class N11134 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numberOfCookie = Integer.parseInt(st.nextToken());
            int dailyIntake = Integer.parseInt(st.nextToken());

            if (numberOfCookie%dailyIntake == 0) {
                bw.write(numberOfCookie/dailyIntake + "\n");
            } else {
                bw.write((numberOfCookie/dailyIntake) + 1 + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11134().solution();
    }
}

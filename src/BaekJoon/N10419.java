package BaekJoon;

import java.io.*;

//지각
public class N10419 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int lectureTime = Integer.parseInt(br.readLine());
            int lateTime = lectureTime;
            int result = lateTime + lateTime*lateTime;

            while (result > lectureTime) {
                lateTime--;
                result = lateTime + lateTime*lateTime;
            }

            bw.write(lateTime + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10419().solution();
    }
}

package BaekJoon;

import java.io.*;

//배수 찾기
public class N4504 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int target = 0;

        while ((target = Integer.parseInt(br.readLine())) != 0) {
            if (target % n == 0) {
                bw.write(target + " is a multiple of " + n + ".\n");
            } else {
                bw.write(target + " is NOT a multiple of " + n + ".\n");
            }
        }

        br.close();
        bw.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4504().solution();
    }
}

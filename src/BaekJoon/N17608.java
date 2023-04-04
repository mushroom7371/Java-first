package BaekJoon;

import java.io.*;

//막대기
public class N17608 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int [] stickArray = new int[testCase];
        int stick = 0;


        for (int i = 0; i < testCase; i++) {
            stickArray[i] = Integer.parseInt(br.readLine());

            if (i == testCase -1) {
                stick = stickArray[i];
            }
        }

        int count = 1;
        for (int i = testCase-2; i >= 0; i--) {
            if (stickArray[i] > stick) {
                count++;
                stick = stickArray[i];
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17608().solution();
    }
}

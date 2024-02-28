package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//받아올림
public class N4388 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            int carry = 0;
            int count = 0;
            while (a > 0 || b > 0) {
                int aDigit = a % 10;
                int bDigit = b % 10;
                a /= 10;
                b /= 10;

                if (aDigit + bDigit + carry >= 10) {
                    count++;
                    carry = 1;
                } else {
                    carry = 0;
                }
            }

            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4388().solution();
    }
}

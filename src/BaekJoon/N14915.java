package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//진수 변환기
public class N14915 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int targetNumber = Integer.parseInt(st.nextToken());
        int base = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if (targetNumber == 0) {
            sb.append(0);
        } else {
            while (targetNumber > 0) {
                int remainder = targetNumber % base;
                if (remainder < 10) {
                    sb.append(remainder);
                } else {
                    sb.append((char) (remainder - 10 + 'A'));
                }
                targetNumber /= base;
            }
        }

        bw.write(sb.reverse().toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14915().solution();
    }
}

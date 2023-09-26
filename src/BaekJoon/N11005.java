package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//진법 변환 2
public class N11005 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        int base = Integer.parseInt(st.nextToken());
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int remainder = number % base;
            if (remainder >= 10) {
                result.append((char) (remainder + 55));
            } else {
                result.append(remainder);
            }
            number /= base;
        }

        bw.write(result.reverse().toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11005().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//숫자
public class N10093 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long startNumber = Long.parseLong(st.nextToken());
        long endNumber = Long.parseLong(st.nextToken());
        long min = Math.min(startNumber, endNumber);
        long max = Math.max(startNumber, endNumber);

        long numberBetweenNumbers = max - min - 1;
        if (max == min) {
            numberBetweenNumbers = 0;
        }

        bw.write(numberBetweenNumbers + "\n");

        for (int i = 1; i <= numberBetweenNumbers; i++) {
            bw.write(min + i + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10093().solution();
    }
}

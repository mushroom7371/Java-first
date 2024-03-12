package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//사과와 바나나 나눠주기
public class N14914 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfApple = Integer.parseInt(st.nextToken());
        int numberOfBanana = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= Math.min(numberOfApple, numberOfBanana); i++) {
            if (numberOfApple % i == 0 && numberOfBanana % i == 0) {
                bw.write(i + " " + numberOfApple / i + " " + numberOfBanana / i + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14914().solution();
    }
}

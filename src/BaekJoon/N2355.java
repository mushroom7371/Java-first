package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//시그마
public class N2355 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long firstNumber = Long.parseLong(st.nextToken());
        long secondNumber = Long.parseLong(st.nextToken());
        long sum = 0;

        if (firstNumber - secondNumber > 0) {
            sum = (firstNumber + secondNumber) * (firstNumber - secondNumber + 1) / 2;
        } else {
            sum = (firstNumber + secondNumber) * (secondNumber - firstNumber + 1) / 2;
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2355().solution();
    }
}

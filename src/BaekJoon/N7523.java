package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Gauß
public class N7523 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 1; i <= testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long firstNumber = Long.parseLong(st.nextToken());
            long secondNumber = Long.parseLong(st.nextToken());

            long sum = 0;
            if (firstNumber - secondNumber > 0) {
                sum = (firstNumber + secondNumber) * (firstNumber - secondNumber + 1) / 2;
            } else {
                sum = (firstNumber + secondNumber) * (secondNumber - firstNumber + 1) / 2;
            }

            if (i != testCase) {
                bw.write("Scenario #" + i + ":\n" + sum + "\n\n");
            } else {
                bw.write("Scenario #" + i + ":\n" + sum);
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N7523().solution();
    }
}

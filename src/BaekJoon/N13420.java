package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//사칙연산
public class N13420 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine(), " ");
            long firstNumber = Long.parseLong(st.nextToken());
            String operator = st.nextToken();
            long secondNumber = Long.parseLong(st.nextToken());
            String equal = st.nextToken();
            long result = Long.parseLong(st.nextToken());

            if (operator.equals("+")) {
                if (firstNumber + secondNumber == result) {
                    bw.write("correct\n");
                } else {
                    bw.write("wrong answer\n");
                }
            } else if (operator.equals("-")) {
                if (firstNumber - secondNumber == result) {
                    bw.write("correct\n");
                } else {
                    bw.write("wrong answer\n");
                }
            } else if (operator.equals("*")) {
                if (firstNumber * secondNumber == result) {
                    bw.write("correct\n");
                } else {
                    bw.write("wrong answer\n");
                }
            } else {
                if (firstNumber / secondNumber == result) {
                    bw.write("correct\n");
                } else {
                    bw.write("wrong answer\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13420().solution();
    }
}

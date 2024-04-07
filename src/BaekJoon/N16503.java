package BaekJoon;

import java.io.*;

//괄호 없는 사칙연산
public class N16503 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int numberA = Integer.parseInt(s[0]);
        int numberB = Integer.parseInt(s[2]);
        int numberC = Integer.parseInt(s[4]);

        int resultA = calculate(calculate(numberA, numberB, s[1].charAt(0)), numberC, s[3].charAt(0));
        int resultB = calculate(numberA, calculate(numberB, numberC, s[3].charAt(0)), s[1].charAt(0));

        bw.write(Math.min(resultA, resultB) + "\n");
        bw.write(Math.max(resultA, resultB) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                return a / b;
        }
    }

    public static void main(String[] args) throws IOException {
        new N16503().solution();
    }
}

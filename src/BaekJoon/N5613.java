package BaekJoon;

import java.io.*;

//계산기 프로그램
public class N5613 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = Integer.parseInt(br.readLine());

        while (true) {
            String operator = br.readLine();
            if (operator.equals("=")) {
                break;
            }

            int number = Integer.parseInt(br.readLine());

            switch (operator) {
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    result *= number;
                    break;
                case "/":
                    result /= number;
                    break;
            }
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5613().solution();
    }
}

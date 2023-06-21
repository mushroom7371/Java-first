package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//세 수
public class N2985 {
        void solution() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstNumber = Integer.parseInt(st.nextToken());
            int secondNumber = Integer.parseInt(st.nextToken());
            int thirdNumber = Integer.parseInt(st.nextToken());
            String[] result = checkOperator(firstNumber, secondNumber, thirdNumber);

            bw.write(firstNumber + result[0] + secondNumber + result[1] + thirdNumber);

            br.close();
            bw.flush();
            bw.close();
        }

        String[] checkOperator(int firstNumber, int secondNumber, int thirdNumber) {
            String[] result = new String[2];
            if (firstNumber + secondNumber == thirdNumber) {
                result[0] = "+";
                result[1] = "=";
            } else if (firstNumber - secondNumber == thirdNumber) {
                result[0] = "-";
                result[1] = "=";
            } else if (firstNumber * secondNumber == thirdNumber) {
                result[0] = "*";
                result[1] = "=";
            } else if (firstNumber / secondNumber == thirdNumber) {
                result[0] = "/";
                result[1] = "=";
            } else if (firstNumber == secondNumber + thirdNumber) {
                result[0] = "=";
                result[1] = "+";
            } else if (firstNumber == secondNumber - thirdNumber) {
                result[0] = "=";
                result[1] = "-";
            } else if (firstNumber == secondNumber * thirdNumber) {
                result[0] = "=";
                result[1] = "*";
            } else if (firstNumber == secondNumber / thirdNumber) {
                result[0] = "=";
                result[1] = "/";
            }
            return result;
        }

        public static void main(String[] args) throws IOException {
            new N2985().solution();
        }
}

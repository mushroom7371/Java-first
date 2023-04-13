package BaekJoon;

import java.io.*;

//화성 수학
public class N5355 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String [] inputArray = br.readLine().split(" ");
            double number = Double.parseDouble(inputArray[0]);

            for (int i = 1; i < inputArray.length; i++) {
                String operator = inputArray[i];

                if (operator.equals("@")) {
                    number *= 3;
                } else if (operator.equals("%")) {
                    number += 5;
                } else if (operator.equals("#")) {
                    number -= 7;
                }
            }

            bw.write(String.format("%.2f", number) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5355().solution();
    }
}

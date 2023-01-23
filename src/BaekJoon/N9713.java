package BaekJoon;

import java.io.*;

//Sum of Odd Sequence
public class N9713 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int inputNumber = Integer.parseInt(br.readLine());
            int sum = 0;

            for (int i = 1; i <= inputNumber; i += 2) {
                sum += i;
            }

            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9713().solution();
    }
}

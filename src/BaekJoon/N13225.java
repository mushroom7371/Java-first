package BaekJoon;

import java.io.*;

//Divisors
public class N13225 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int number = Integer.parseInt(br.readLine());
            int count = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }

            bw.write(number + " " + count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13225().solution();
    }
}

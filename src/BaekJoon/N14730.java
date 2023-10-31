package BaekJoon;

import java.io.*;

//謎紛芥索紀 (Small)
public class N14730 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfPolynomial = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < numberOfPolynomial; i++) {
            String[] inputArray = br.readLine().split(" ");
            int coefficient = Integer.parseInt(inputArray[0]);
            int exponent = Integer.parseInt(inputArray[1]);
            sum += coefficient * exponent;
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14730().solution();
    }
}

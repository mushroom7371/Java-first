package BaekJoon;

import java.io.*;

//노솔브 방지문제야!!
public class N15917 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String binary = Integer.toBinaryString(Integer.parseInt(br.readLine()));

            boolean isPowerOfTwo = true;
            for (int i = 1; i < binary.length(); i++) {
                if (binary.charAt(i) != '0') {
                    isPowerOfTwo = false;
                    break;
                }
            }

            bw.write(isPowerOfTwo ? "1\n" : "0\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15917().solution();
    }
}

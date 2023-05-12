package BaekJoon;

import java.io.*;

//해밍 거리
public class N3449 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String input1 = br.readLine();
            String input2 = br.readLine();
            int result = 0;

            for (int i = 0; i < input1.length(); i++) {
                if (input1.charAt(i) != input2.charAt(i)) {
                    result++;
                }
            }

            bw.write("Hamming distance is " + result + ".\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N3449().solution();
    }
}

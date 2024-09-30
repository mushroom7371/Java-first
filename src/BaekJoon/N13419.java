package BaekJoon;

import java.io.*;

//탕수육
public class N13419 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String input = br.readLine();
            StringBuilder first = new StringBuilder();
            StringBuilder second = new StringBuilder();

            for (int i = 0; i < input.length(); i += 2) {
                first.append(input.charAt(i));
            }

            for (int i = 1; i < input.length(); i += 2) {
                second.append(input.charAt(i));
            }

            String resultA = first.toString();
            String resultB = second.toString();

            if (input.length() % 2 == 1) {
                resultA += second.toString();
                resultB += first.toString();
            }

            bw.write(resultA + "\n" + resultB + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13419().solution();
    }
}

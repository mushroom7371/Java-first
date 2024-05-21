package BaekJoon;

import java.io.*;

//Dedupe
public class N5357 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String input = br.readLine();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (result.length() == 0) {
                    result.append(c);
                } else {
                    if (result.charAt(result.length() - 1) != c) {
                        result.append(c);
                    }
                }
            }

            bw.write(result.toString() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5357().solution();
    }
}

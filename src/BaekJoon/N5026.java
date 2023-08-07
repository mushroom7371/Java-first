package BaekJoon;

import java.io.*;

//박사 과정
public class N5026 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String input = br.readLine();

            if (input.charAt(0) == 'P') {
                bw.write("skipped\n");
                continue;
            }

            String[] number = input.split("\\+");
            int left = Integer.parseInt(number[0]);
            int right = Integer.parseInt(number[1]);
            bw.write((left + right) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5026().solution();
    }
}

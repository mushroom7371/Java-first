package BaekJoon;

import java.io.*;

//ZOAC 6
public class N30045 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        int count = 0;
        while (testCase --> 0) {
            String input = br.readLine();

            if (input.contains("01") || input.contains("OI")) {
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30045().solution();
    }
}

package BaekJoon;

import java.io.*;

//한다 안한다
public class N5789 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String input = br.readLine();
            int index = input.length()/2;

            if (input.charAt(index-1) == input.charAt(index)) {
                bw.write("Do-it\n");
            } else {
                bw.write("Do-it-Not\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5789().solution();
    }
}

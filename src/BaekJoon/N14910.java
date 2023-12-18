package BaekJoon;

import java.io.*;

//오르막
public class N14910 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        boolean isAscending = true;

        for (int i = 0; i < input.length - 1; i++) {
            if (Integer.parseInt(input[i]) > Integer.parseInt(input[i + 1])) {
                isAscending = false;
                break;
            }
        }

        bw.write(isAscending ? "Good" : "Bad");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14910().solution();
    }
}

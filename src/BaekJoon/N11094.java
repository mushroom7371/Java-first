package BaekJoon;

import java.io.*;

//꿍 가라사대
public class N11094 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String[] input = br.readLine().split(" ");

            if (input[0].equals("Simon") && input[1].equals("says")) {
                for (int i = 2; i < input.length; i++) {
                    bw.write(" " + input[i]);
                }
                bw.write("\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11094().solution();
    }
}

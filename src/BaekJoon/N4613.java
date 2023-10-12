package BaekJoon;

import java.io.*;

//Quicksum
public class N4613 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while (true) {
            input = br.readLine();
            if (input.equals("#")) {
                break;
            }

            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == ' ') {
                    continue;
                }
                sum += (i + 1) * (c - 'A' + 1);
            }

            bw.write(sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4613().solution();
    }
}

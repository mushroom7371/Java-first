package BaekJoon;

import java.io.*;

//거울, 오! 거울
public class N4740 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("***")) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = input.length()-1; i >= 0; i--) {
                sb.append(input.charAt(i));
            }

            bw.write(sb + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4740().solution();
    }
}

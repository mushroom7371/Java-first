package BaekJoon;

import java.io.*;

//도깨비말
public class N9226 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("#")) {
                break;
            }

            if (input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o' || input.charAt(0) == 'u') {
                bw.write(input + "ay\n");
                continue;
            }

            int idx = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                    idx = i;
                    break;
                }
            }

            bw.write(input.substring(idx) + input.substring(0, idx) + "ay\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9226().solution();
    }
}

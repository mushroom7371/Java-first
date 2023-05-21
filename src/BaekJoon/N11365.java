package BaekJoon;

import java.io.*;

//!밀비 급일
public class N11365 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;
        String input = "";


        while (!(input = br.readLine()).equals("END")) {
            sb = new StringBuilder();

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
        new N11365().solution();
    }
}

package BaekJoon;

import java.io.*;

//버그왕
public class N3447 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        String bug = "BUG";

        while ((input = br.readLine()) != null) {
            boolean isBug = true;
            while (isBug) {
                String replaced = input.replaceAll(bug, "");
                if (replaced.equals(input)) {
                    isBug = false;
                }
                input = replaced;
            }

            bw.write(input + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N3447().solution();
    }
}

package BaekJoon;

import java.io.*;

//Tautogram
public class N5698 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("*")) {
                break;
            }
            String[] words = input.split(" ");
            boolean isTautogram = true;

            for (int i = 0; i < words.length - 1; i++) {
                if (Character.toLowerCase(words[i].charAt(0)) != Character.toLowerCase(words[i + 1].charAt(0))) {
                    isTautogram = false;
                    break;
                }
            }

            bw.write(isTautogram ? "Y\n" : "N\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5698().solution();
    }
}

package BaekJoon;

import java.io.*;

//문자가 몇갤까
public class N7600 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("#")) {
                break;
            }

            boolean[] isExistAlphabetArray = new boolean[26];
            input.toLowerCase().chars().forEach(c -> {
                if (c >= 97 && c <= 122) {
                    isExistAlphabetArray[c - 97] = true;
                }
            });

            int count = 0;
            for (int i = 0; i < isExistAlphabetArray.length; i++) {
                if (isExistAlphabetArray[i]) {
                    count++;
                }
            }

            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N7600().solution();
    }
}

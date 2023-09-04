package BaekJoon;

import java.io.*;

//유진수
public class N1356 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String numberString = br.readLine();
        boolean isYuJinNumber = true;

        if (numberString.length() == 1) {
            bw.write("NO");
        } else {
            for (int i = 1; i < numberString.length(); i++) {
                int left = 1;
                int right = 1;

                for (int j = 0; j < i; j++) {
                    left *= Integer.parseInt(String.valueOf(numberString.charAt(j)));
                }

                for (int j = i; j < numberString.length(); j++) {
                    right *= Integer.parseInt(String.valueOf(numberString.charAt(j)));
                }

                if (left == right) {
                    bw.write("YES");
                    isYuJinNumber = false;
                    break;
                }
            }

            if (isYuJinNumber) {
                bw.write("NO");
            }

        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1356().solution();
    }
}

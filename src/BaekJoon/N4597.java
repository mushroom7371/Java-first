package BaekJoon;

import java.io.*;

//패리티
public class N4597 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String binary = br.readLine();
            if (binary.equals("#")) {
                break;
            }

            int length = binary.length();
            int countOfOne = 0;
            boolean isEven = false;
            if (binary.charAt(length - 1) == 'e') {
                isEven = true;
            }

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < binary.length() -1; i++) {
                if (binary.charAt(i) == '1') {
                    countOfOne++;
                }
                result.append(binary.charAt(i));
            }

            if (isEven) {
                if (countOfOne % 2 == 0) {
                    result.append("0");
                } else {
                    result.append("1");
                }
            } else {
                if (countOfOne % 2 == 0) {
                    result.append("1");
                } else {
                    result.append("0");
                }
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4597().solution();
    }
}

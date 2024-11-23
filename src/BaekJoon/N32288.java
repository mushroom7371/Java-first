package BaekJoon;

import java.io.*;

//바코드 닉네임
public class N32288 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String input = br.readLine();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);

            if (c == 'I') {
                result.append("i");
            } else {
                result.append("L");
            }
        }

        bw.write(result.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32288().solution();
    }
}

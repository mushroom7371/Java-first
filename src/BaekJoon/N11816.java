package BaekJoon;

import java.io.*;

//8진수, 10진수, 16진수
public class N11816 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int result = 0;
        String firstStr = input.charAt(0) + "";

        if (!firstStr.equals("0")) {
            result = Integer.parseInt(input);
        } else {
            if (input.charAt(1) == 'x') {
                result = Integer.parseInt(input.substring(2), 16);
            } else {
                result = Integer.parseInt(input.substring(1), 8);
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11816().solution();
    }
}

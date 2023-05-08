package BaekJoon;

import java.io.*;

//지속
public class N11648 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String number = br.readLine();
        int count = 0;

        while (number.length() > 1) {
            count++;
            number = multiple(number);
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    String multiple(String number) {
        int result = 1;

        for (int i = 0; i < number.length(); i++) {
            result *= Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) throws IOException {
        new N11648().solution();
    }
}

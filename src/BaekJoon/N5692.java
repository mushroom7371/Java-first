package BaekJoon;

import java.io.*;

//팩토리얼 진법
public class N5692 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }

            int length = input.length();
            int result = 0;

            for (int i = 0; i < input.length(); i++) {
                int number = input.charAt(i) - '0';
                for (int j = length - i; j > 0; j--) {
                    number *= j;
                }

                result += number;
            }
            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5692().solution();
    }
}

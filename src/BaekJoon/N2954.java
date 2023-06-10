package BaekJoon;

import java.io.*;

//창영이의 일기장
public class N2954 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));

            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' ||
                    input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                i += 2;
            }
        }

        bw.write(String.valueOf(sb));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2954().solution();
    }
}

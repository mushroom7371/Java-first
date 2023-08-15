package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//진법 변환
public class N2745 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String number = st.nextToken();
        int base = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 0; i < number.length(); i++) {
            int temp = 0;
            if (number.charAt(i) >= 'A' && number.charAt(i) <= 'Z') {
                temp = number.charAt(i) - 'A' + 10;
            } else {
                temp = number.charAt(i) - '0';
            }

            result += temp * Math.pow(base, number.length()-i-1);
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2745().solution();
    }
}

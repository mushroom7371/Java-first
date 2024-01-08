package BaekJoon;

import java.io.*;

//SMUPC의 등장
public class N21734 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int temp = input.charAt(i);
            int sum = 0;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }

            for (int j = 0; j < sum; j++) {
                sb.append(input.charAt(i));
            }

            sb.append("\n");
        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N21734().solution();
    }
}

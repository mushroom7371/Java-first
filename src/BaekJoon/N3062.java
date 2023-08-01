package BaekJoon;

import java.io.*;

//수 뒤집기
public class N3062 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String number = br.readLine();
            String reverseNumber = new StringBuilder(number).reverse().toString();
            int sum = Integer.parseInt(number) + Integer.parseInt(reverseNumber);

            if (String.valueOf(sum).equals(new StringBuilder(String.valueOf(sum)).reverse().toString())) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N3062().solution();
    }
}

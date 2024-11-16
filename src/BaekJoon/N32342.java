package BaekJoon;

import java.io.*;

//와우와 쿼리
public class N32342 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        String wow = "WOW";
        while (testCase --> 0) {
            String input = br.readLine();
            StringBuilder sb;
            int count = 0;

            for (int i = 0; i < input.length() - 2; i++) {
                sb = new StringBuilder();
                sb.append(input.charAt(i));
                sb.append(input.charAt(i + 1));
                sb.append(input.charAt(i + 2));

                if (sb.toString().equals(wow)) {
                    count++;
                }
            }

            bw.write(count + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N32342().solution();
    }
}

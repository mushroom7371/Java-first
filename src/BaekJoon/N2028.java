package BaekJoon;

import java.io.*;

//자기 복제수
public class N2028 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            String strNumber = br.readLine();
            int number = Integer.parseInt(strNumber);
            String square = String.valueOf(number * number);
            String target = square.substring(square.length() - strNumber.length());

            if (strNumber.equals(target)) {
                bw.write("YES");
            } else {
                bw.write("NO");
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2028().solution();
    }
}

package BaekJoon;

import java.io.*;

//8진수 2진수
public class N1212 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] binaryArray = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String octal = br.readLine();

        if (octal.equals("0")) {
            bw.write("0");
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < octal.length(); i++) {
                int number = octal.charAt(i) - '0';
                result.append(binaryArray[number]);
            }

            while (result.charAt(0) == '0') {
                result.deleteCharAt(0);
            }

            bw.write(String.valueOf(result));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1212().solution();
    }
}

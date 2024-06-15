package BaekJoon;

import java.io.*;

//ID
public class N9907 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String number = br.readLine();

        int sum = 0;
        sum += (number.charAt(0) - '0') * 2;
        for (int i = 1; i <= 6; i++) {
            int num = number.charAt(i) - '0';
            sum += num * (8 - i);
        }

        int charIndex = sum % 11;
        String[] arr = {"J", "A", "B", "C", "D", "E", "F", "G", "H", "I", "Z"};

        bw.write(arr[charIndex] + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9907().solution();
    }
}

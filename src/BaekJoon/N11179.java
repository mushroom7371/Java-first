package BaekJoon;

import java.io.*;

//2진수 뒤집기
public class N11179 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputNumber = Integer.parseInt(br.readLine());
        String binaryNumberString = Integer.toBinaryString(inputNumber);
        StringBuilder reverseBinary = new StringBuilder();

        for (int i = binaryNumberString.length()-1; i >= 0; i--) {
            reverseBinary.append(binaryNumberString.charAt(i));
        }

        int result = Integer.parseInt(String.valueOf(reverseBinary), 2);
        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11179().solution();
    }
}

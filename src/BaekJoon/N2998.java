package BaekJoon;

import java.io.*;

//8진수
public class N2998 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder binary = new StringBuilder(br.readLine());

        while (true) {
            if (binary.length() % 3 == 0) {
                break;
            }
            binary.insert(0, "0");
        }

        StringBuilder octal = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 3) {
            octal.append(binaryToOctal(binary.substring(i, i + 3)));
        }

        bw.write(octal + "");

        br.close();
        bw.flush();
        bw.close();
    }

    String binaryToOctal(String binary) {
        switch (binary) {
            case "000":
                return "0";
            case "001":
                return "1";
            case "010":
                return "2";
            case "011":
                return "3";
            case "100":
                return "4";
            case "101":
                return "5";
            case "110":
                return "6";
        }
        return "7";
    }

    public static void main(String[] args) throws IOException {
        new N2998().solution();
    }
}

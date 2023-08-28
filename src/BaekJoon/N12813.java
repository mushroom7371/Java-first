package BaekJoon;

import java.io.*;

//이진수 연산
public class N12813 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String binaryA = br.readLine();
        String binaryB = br.readLine();
        StringBuilder andResult = new StringBuilder();
        StringBuilder orResult = new StringBuilder();
        StringBuilder xorResult = new StringBuilder();
        StringBuilder notResultA = new StringBuilder();
        StringBuilder notResultB = new StringBuilder();

        for (int i = 0; i < binaryA.length(); i++) {
            if (binaryA.charAt(i) == '1' && binaryB.charAt(i) == '1') {
                andResult.append("1");
            } else {
                andResult.append("0");
            }

            if (binaryA.charAt(i) == '1' || binaryB.charAt(i) == '1') {
                orResult.append("1");
            } else {
                orResult.append("0");
            }

            if (binaryA.charAt(i) == binaryB.charAt(i)) {
                xorResult.append("0");
            } else {
                xorResult.append("1");
            }

            if (binaryA.charAt(i) == '1') {
                notResultA.append("0");
            } else {
                notResultA.append("1");
            }

            if (binaryB.charAt(i) == '1') {
                notResultB.append("0");
            } else {
                notResultB.append("1");
            }
        }

        bw.write(andResult + "\n" + orResult + "\n" + xorResult + "\n" + notResultA + "\n" + notResultB);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N12813().solution();
    }
}

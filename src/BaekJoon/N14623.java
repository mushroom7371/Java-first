package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//감정이입
public class N14623 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String binaryA = br.readLine();
        StringBuilder reverseBinaryB = new StringBuilder(br.readLine()).reverse();
        List<String> andResult = new ArrayList<>();

        for (int i = 0; i < reverseBinaryB.length(); i++) {
            if (reverseBinaryB.charAt(i) == '1') {
                StringBuilder tempBinary = new StringBuilder(binaryA);
                for (int j = 0; j < i; j++) {
                    tempBinary.append("0");
                }
                andResult.add(tempBinary.toString());
            }
        }

        long result = 0;
        for (String s : andResult) {
            result += Long.parseLong(s, 2);
        }

        bw.write(Long.toBinaryString(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14623().solution();
    }
}

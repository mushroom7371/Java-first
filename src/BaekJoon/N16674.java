package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//2018년을 되돌아보며
public class N16674 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String number = br.readLine();
        boolean isTarget = true;

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c != '0' && c != '1' && c != '2' && c != '8') {
                isTarget = false;
                break;
            }
        }

        if (isTarget) {
            Map<Integer, Integer> numberMap = new HashMap<>();
            for (int i = 0; i < number.length(); i++) {
                int c = number.charAt(i) - '0';
                numberMap.put(c, numberMap.getOrDefault(c, 0) + 1);
            }

            if (numberMap.size() != 4) {
                bw.write("1");
            } else {
                if (numberMap.get(0) == numberMap.get(1) && numberMap.get(1) == numberMap.get(2) && numberMap.get(2) == numberMap.get(8)) {
                    bw.write("8");
                } else {
                    bw.write("2");
                }
            }
        } else {
            bw.write("0");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16674().solution();
    }
}

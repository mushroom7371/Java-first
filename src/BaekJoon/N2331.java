package BaekJoon;

import java.io.*;
import java.util.*;

//반복수열
public class N2331 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> numberMap = new HashMap<>();
        numberMap.put(a, 1);

        while (true) {
            int sum = 0;
            while (a > 0) {
                sum += Math.pow(a % 10, p);
                a /= 10;
            }

            if (numberMap.containsKey(sum)) {
                numberMap.put(sum, numberMap.get(sum) + 1);
            } else {
                numberMap.put(sum, 1);
            }

            if (numberMap.get(sum) >= 3) {
                break;
            }
            a = sum;
        }

        int count = 0;
        for (int key : numberMap.keySet()) {
            if (numberMap.get(key) == 1) {
                count++;
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2331().solution();
    }
}

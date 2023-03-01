package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//대표값
public class N2592 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = 10;
        Map<Integer, Integer> numberMap = new HashMap<>();
        int sum = 0;
        int mode = 0;
        int max = 0;

        while (testCase --> 0) {
            int number = Integer.parseInt(br.readLine());
            sum += number;

            if (numberMap.containsKey(number)) {
                numberMap.put(number, numberMap.get(number) + 1);
            } else {
                numberMap.put(number, 1);
            }

            if (max < numberMap.get(number)) {
                max = numberMap.get(number);
                mode = number;
            }
        }

        int average = sum/10;

        bw.write(average + "\n" + mode);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2592().solution();
    }
}

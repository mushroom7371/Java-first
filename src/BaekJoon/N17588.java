package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//Missing Numbers
public class N17588 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        List<Integer> numberList = new ArrayList<>();

        int max = 0;
        for (int i = 0; i < testCase; i++) {
            int number = Integer.parseInt(br.readLine());
            numberList.add(number);
            if (number > max) {
                max = number;
            }
        }

        if (max == numberList.size()) {
            bw.write("good job");
        } {
            for (int i = 1; i < max; i++) {
                boolean isExist = true;
                for (int j = 0; j < numberList.size(); j++) {
                    if (numberList.get(j) == i) {
                        isExist = false;
                        break;
                    }
                }
                if (isExist) {
                    bw.write(i + "\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17588().solution();
    }
}

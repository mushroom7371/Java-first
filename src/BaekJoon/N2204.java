package BaekJoon;

import java.io.*;
import java.util.*;

//도비의 난독증 테스트
public class N2204 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int testCase = Integer.parseInt(br.readLine());
            if (testCase == 0) {
                break;
            }

            String [] wordArray = new String[testCase];
            Map<String, String> wordMap = new HashMap<>();
            for (int i = 0; i < testCase; i++) {
                String input = br.readLine();
                wordArray[i] = input.toLowerCase();
                wordMap.put(wordArray[i], input);
            }

            Arrays.sort(wordArray);

            bw.write(wordMap.get(wordArray[0]) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2204().solution();
    }
}

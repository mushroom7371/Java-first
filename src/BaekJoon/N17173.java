package BaekJoon;

import java.io.*;
import java.util.*;

//배수들의 합
public class N17173 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int targetNumber = Integer.parseInt(st.nextToken());
        int numberOfNumber = Integer.parseInt(st.nextToken());
        Set<Integer> numberSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());
            for (int i = 1; i <= targetNumber; i++) {
                if (i % number == 0) {
                    numberSet.add(i);
                }
            }
        }

        int sum = 0;
        for (int number : numberSet) {
            sum += number;
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17173().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.Arrays;

//카드게임
public class N10801 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] playerA = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] playerB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < playerA.length; i++) {
            if (playerA[i] > playerB[i]) {
                countA++;
            } else if (playerA[i] < playerB[i]) {
                countB++;
            }
        }

        if (countA > countB) {
            bw.write("A");
        } else if (countA < countB) {
            bw.write("B");
        } else {
            bw.write("D");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10801().solution();
    }
}

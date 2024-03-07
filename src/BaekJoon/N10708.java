package BaekJoon;

import java.io.*;
import java.util.Arrays;

//크리스마스 파티
public class N10708 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfFriends = Integer.parseInt(br.readLine());
        int numberOfGames = Integer.parseInt(br.readLine());
        int[] target = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] score = new int[numberOfFriends];
        for (int i = 0; i < numberOfGames; i++) {
            int[] game = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < numberOfFriends; j++) {
                if (game[j] == target[i]) {
                    score[j]++;
                } else {
                    score[target[i] - 1]++;
                }
            }
        }

        for (int i = 0; i < score.length; i++) {
            bw.write(score[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10708().solution();
    }
}

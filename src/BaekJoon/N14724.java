package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Map;

//관리자는 누구?
public class N14724 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfClubMember = Integer.parseInt(br.readLine());
        Map<Integer, String> club = Map.of(
                0, "PROBRAIN",
                1, "GROW",
                2, "ARGOS",
                3, "ADMIN",
                4, "ANT",
                5, "MOTION",
                6, "SPG",
                7, "COMON",
                8, "ALMIGHTY"
        );

        int[] maxScore = new int[9];
        for (int i = 0; i < 9; i++) {
            int[] score = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int max = Arrays.stream(score).max().getAsInt();
            maxScore[i] = max;
        }

        int max = Arrays.stream(maxScore).max().getAsInt();
        for (int i = 0; i < 9; i++) {
            if (max == maxScore[i]) {
                bw.write(club.get(i));
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14724().solution();
    }
}

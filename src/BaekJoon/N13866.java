package BaekJoon;

import java.io.*;
import java.util.Arrays;

//팀 나누기
public class N13866 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] sortedLevels = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        int teamA = sortedLevels[0] + sortedLevels[3];
        int teamB = sortedLevels[1] + sortedLevels[2];

        bw.write(Math.abs(teamA - teamB) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13866().solution();
    }
}

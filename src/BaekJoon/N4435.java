package BaekJoon;

import java.io.*;
import java.util.Arrays;

//중간계 전쟁
public class N4435 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfBattle = Integer.parseInt(br.readLine());
        int[] ganDalfRaceScore = {1, 2, 3, 3, 4, 10};
        int[] sauronRaceScore = {1, 2, 2, 2, 3, 5, 10};

        int battleCount = 0;
        while (numberOfBattle --> 0) {
            battleCount++;
            int[] ganDalfRace = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] sauronRace = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int ganDalfPower = 0;
            for (int i = 0; i < ganDalfRace.length; i++) {
                ganDalfPower += ganDalfRace[i] * ganDalfRaceScore[i];
            }
            int sauronPower = 0;
            for (int i = 0; i < sauronRace.length; i++) {
                sauronPower += sauronRace[i] * sauronRaceScore[i];
            }

            if (ganDalfPower > sauronPower) {
                bw.write("Battle " + battleCount + ": Good triumphs over Evil\n");
            } else if (ganDalfPower < sauronPower) {
                bw.write("Battle " + battleCount + ": Evil eradicates all trace of Good\n");
            } else {
                bw.write("Battle " + battleCount + ": No victor on this battle field\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4435().solution();
    }
}

package BaekJoon;

import java.io.*;

//주사위 네개
public class N2484 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int maxPrize = 0;

        while (testCase --> 0) {
            int[] dice = new int[7];
            int prize = 0;
            String[] input = br.readLine().split(" ");

            for (int i = 0; i < 4; i++) {
                dice[Integer.parseInt(input[i])]++;
            }

            int max = 0;
            int maxIndex = 0;
            for (int i = 1; i < 7; i++) {
                if (dice[i] > max) {
                    max = dice[i];
                    maxIndex = i;
                }
            }

            if (max == 4) {
                prize = 50000 + maxIndex * 5000;
            } else if (max == 3) {
                prize = 10000 + maxIndex * 1000;
            } else if (max == 2) {
                int secondMax = 0;
                int secondMaxIndex = 0;
                for (int i = 1; i < 7; i++) {
                    if (dice[i] > secondMax && i != maxIndex) {
                        secondMax = dice[i];
                        secondMaxIndex = i;
                    }
                }

                if (secondMax == 2) {
                    prize = 2000 + maxIndex * 500 + secondMaxIndex * 500;
                } else {
                    prize = 1000 + maxIndex * 100;
                }
            } else {
                for (int i = 6; i > 0; i--) {
                    if (dice[i] == 1) {
                        prize = i * 100;
                        break;
                    }
                }
            }

            if (prize > maxPrize) {
                maxPrize = prize;
            }
        }

        bw.write(String.valueOf(maxPrize));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2484().solution();
    }
}

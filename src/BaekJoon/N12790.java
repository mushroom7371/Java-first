package BaekJoon;

import java.io.*;
import java.util.Arrays;

//Mini Fantasy War
public class N12790 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int [] statusInfoArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int hp = statusInfoArray[0] + statusInfoArray[4];
            int mp = statusInfoArray[1] + statusInfoArray[5];
            int atk = statusInfoArray[2] + statusInfoArray[6];
            int def = statusInfoArray[3] + statusInfoArray[7];

            hp = ( hp < 1 ) ? 1 : hp;
            mp = ( mp < 1 ) ? 1 : mp;
            atk = ( atk < 0 ) ? 0 : atk;

            int fightingPower = (1*hp) + (5*mp) + (2*atk) + (2*def);

            bw.write(fightingPower + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N12790().solution();
    }
}

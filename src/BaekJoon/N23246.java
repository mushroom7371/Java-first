package BaekJoon;

import java.io.*;
import java.util.*;

//Sport Climbing Combined
public class N23246 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int [][] playerArray = new int[testCase][3];
        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int playerNumber = Integer.parseInt(st.nextToken());
            int leadClimbing = Integer.parseInt(st.nextToken());
            int speedClimbing = Integer.parseInt(st.nextToken());
            int bouldering = Integer.parseInt(st.nextToken());

            playerArray[i][0] = playerNumber;
            playerArray[i][1] = leadClimbing*speedClimbing*bouldering;
            playerArray[i][2] = leadClimbing+speedClimbing+bouldering;
        }

        Arrays.sort(playerArray, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    if (o1[2] == o2[2]) {
                        return o1[0]-(o2[0]);
                    }
                    return o1[2]-(o2[2]);
                }
                return o1[1]-(o2[1]);
            }
        });

        for (int i = 0; i < 3; i++) {
            bw.write(playerArray[i][0] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23246().solution();
    }
}

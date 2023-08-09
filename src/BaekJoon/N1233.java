package BaekJoon;

import java.io.*;
import java.util.*;

//주사위
public class N1233 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstDice = Integer.parseInt(st.nextToken());
        int secondDice = Integer.parseInt(st.nextToken());
        int thirdDice = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> diceMap = new HashMap<>();

        for (int i = 1; i <= firstDice; i++) {
            for (int j = 1; j <= secondDice; j++) {
                for (int k = 1; k <= thirdDice; k++) {
                    int sum = i + j + k;
                    diceMap.put(sum, diceMap.getOrDefault(sum, 0) + 1);
                }
            }
        }

        int max = 0;
        int answer = 0;
        for (int key : diceMap.keySet()) {
            if (max < diceMap.get(key)) {
                max = diceMap.get(key);
                answer = key;
            }
        }

        bw.write(String.valueOf(answer));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1233().solution();
    }
}

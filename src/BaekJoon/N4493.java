package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//가위 바위 보?
public class N4493 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Map<String, Integer> mapping = new HashMap<>();
        mapping.put("S", 1);
        mapping.put("R", 2);
        mapping.put("P", 3);

        while (testCase --> 0) {
            int playerScore = 0;
            int numberOfRps = Integer.parseInt(br.readLine());

            for (int i = 0; i < numberOfRps; i++) {
                String [] resultArray = br.readLine().split(" ");

                int result = mapping.get(resultArray[0]) - mapping.get(resultArray[1]);

                if (result == 1 || result == -2) {
                    playerScore++;
                } else if (result == -1 || result == 2) {
                    playerScore--;
                }
            }

            if (playerScore > 0) {
                bw.write("Player 1\n");
            } else if (playerScore < 0) {
                bw.write("Player 2\n");
            } else {
                bw.write("TIE\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4493().solution();
    }
}

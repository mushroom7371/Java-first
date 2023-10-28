package BaekJoon;

import java.io.*;
import java.util.Arrays;

//카드 바꿔치기
public class N18766 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int numberOfCard = Integer.parseInt(br.readLine());
            String[] beforeCard = br.readLine().split(" ");
            String[] afterCard = br.readLine().split(" ");

            Arrays.sort(beforeCard);
            Arrays.sort(afterCard);

            for (int i = 0; i < numberOfCard; i++) {
                if (!beforeCard[i].equals(afterCard[i])) {
                    bw.write("CHEATER\n");
                    break;
                }
                if (i == numberOfCard - 1) {
                    bw.write("NOT CHEATER\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N18766().solution();
    }
}

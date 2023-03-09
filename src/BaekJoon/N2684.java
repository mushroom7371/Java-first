package BaekJoon;

import java.io.*;

//동전 게임
public class N2684 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb;

        while (testCase --> 0) {
            int [] coinRecord = new int[8];
            String coins = br.readLine();

            for (int i = 0; i < coins.length()-2; i++) {
                sb = new StringBuilder();

                sb.append(coins, i, i+3);
                coinRecord[recordCoinResult(String.valueOf(sb))]++;
            }

            for (int i = 0; i < coinRecord.length; i++) {
                bw.write(coinRecord[i] + " ");
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    int recordCoinResult (String coin) {
        int index = 0;

        switch (coin) {
            case "TTH" :
                index = 1;
                break;
            case "THT" :
                index = 2;
                break;
            case "THH" :
                index = 3;
                break;
            case "HTT" :
                index = 4;
                break;
            case "HTH" :
                index = 5;
                break;
            case "HHT" :
                index = 6;
                break;
            case "HHH" :
                index = 7;
                break;
        }

        return index;
    }

    public static void main(String[] args) throws IOException {
        new N2684().solution();
    }
}

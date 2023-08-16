package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//양념 반 후라이드 반
public class N16917 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int priceOfSeasonedChicken = Integer.parseInt(st.nextToken());
        int priceOfFriedChicken = Integer.parseInt(st.nextToken());
        int priceOfHalfHalfChicken = Integer.parseInt(st.nextToken());
        int numberOfSeasonedChicken = Integer.parseInt(st.nextToken());
        int numberOfFriedChicken = Integer.parseInt(st.nextToken());
        int result = 0;

        if (priceOfHalfHalfChicken * 2 < priceOfSeasonedChicken + priceOfFriedChicken) {
            int numberOfHalfHalfChicken = Math.min(numberOfSeasonedChicken, numberOfFriedChicken);
            result += numberOfHalfHalfChicken * priceOfHalfHalfChicken * 2;
            numberOfSeasonedChicken -= numberOfHalfHalfChicken;
            numberOfFriedChicken -= numberOfHalfHalfChicken;

            if (numberOfSeasonedChicken > 0 ) {
                if (priceOfSeasonedChicken < priceOfHalfHalfChicken * 2) {
                    result += numberOfSeasonedChicken * priceOfSeasonedChicken;
                } else {
                    result += numberOfSeasonedChicken * priceOfHalfHalfChicken * 2;
                }
            } else if (numberOfFriedChicken > 0) {
                if (priceOfFriedChicken < priceOfHalfHalfChicken * 2) {
                    result += numberOfFriedChicken * priceOfFriedChicken;
                } else {
                    result += numberOfFriedChicken * priceOfHalfHalfChicken * 2;
                }
            }
        } else {
            result += numberOfSeasonedChicken * priceOfSeasonedChicken + numberOfFriedChicken * priceOfFriedChicken;
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N16917().solution();
    }
}

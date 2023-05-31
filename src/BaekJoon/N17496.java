package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//스타후르츠
public class N17496 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dayOfSummer = Integer.parseInt(st.nextToken());
        int dayOfHarvest = Integer.parseInt(st.nextToken());
        int ableToHarvest = Integer.parseInt(st.nextToken());
        int priceOfFruit = Integer.parseInt(st.nextToken());
        int numberOfFruit = 0;

        for (int i = 1; i <= dayOfSummer-dayOfHarvest; i += dayOfHarvest) {
            numberOfFruit += ableToHarvest;
        }

        bw.write(numberOfFruit * priceOfFruit + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N17496().solution();
    }
}

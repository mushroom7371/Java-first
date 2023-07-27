package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//꿍의 우주여행
public class N9501 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine());
            int numberOfSpaceShip = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());

            int count = 0;
            for (int i = 0; i < numberOfSpaceShip; i++) {
                st = new StringTokenizer(br.readLine());
                int speedOfSpaceShip = Integer.parseInt(st.nextToken());
                int fuelOfSpaceShip = Integer.parseInt(st.nextToken());
                int fuelConsumptionRateOfSpaceShip = Integer.parseInt(st.nextToken());

                double fuelPerHour = (double) fuelOfSpaceShip / fuelConsumptionRateOfSpaceShip;

                if (fuelPerHour * speedOfSpaceShip >= distance) {
                    count++;
                }
            }

            bw.write(count + "\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9501().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//트럭 주차
public class N2979 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int parkingFeeOfOne = Integer.parseInt(st.nextToken());
        int parkingFeeOfTwo = Integer.parseInt(st.nextToken());
        int parkingFeeOfThree = Integer.parseInt(st.nextToken());
        int[] parkingTime = new int[101];

        int numberOfCar = 3;
        for (int i = 0; i < numberOfCar; i++) {
            st = new StringTokenizer(br.readLine());
            int startParkingTime = Integer.parseInt(st.nextToken());
            int endParkingTime = Integer.parseInt(st.nextToken());

            for (int j = startParkingTime; j < endParkingTime; j++) {
                parkingTime[j]++;
            }
        }

        int totalFee = 0;

        for (int i = 0; i < parkingTime.length; i++) {
            if (parkingTime[i] == 1) {
                totalFee += parkingFeeOfOne;
            } else if (parkingTime[i] == 2) {
                totalFee += parkingFeeOfTwo * 2;
            } else if (parkingTime[i] == 3) {
                totalFee += parkingFeeOfThree * 3;
            }
        }

        bw.write(totalFee + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2979().solution();
    }
}

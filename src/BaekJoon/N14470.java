package BaekJoon;

import java.io.*;

//전자레인지
public class N14470 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int currentMeatTemperature = Integer.parseInt(br.readLine());
        int targetMeatTemperature = Integer.parseInt(br.readLine());
        int timeToHeatUpFrozenMeat = Integer.parseInt(br.readLine());
        int timeToHeatUpFrozenMeatTemperatureZero = Integer.parseInt(br.readLine());
        int timeToHeatUpDefrostedMeat = Integer.parseInt(br.readLine());

        int timeToHeatUp = 0;
        if (currentMeatTemperature < 0 && targetMeatTemperature > 0) {
            timeToHeatUp += timeToHeatUpDefrostedMeat;
        }

        while (currentMeatTemperature != targetMeatTemperature) {
            if (currentMeatTemperature < 0) {
                timeToHeatUp += timeToHeatUpFrozenMeat;
            } else if (currentMeatTemperature == 0) {
                timeToHeatUp += timeToHeatUpFrozenMeatTemperatureZero;
            } else {
                timeToHeatUp += timeToHeatUpDefrostedMeat;
            }
            currentMeatTemperature++;
        }

        bw.write(String.valueOf(timeToHeatUp));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14470().solution();
    }
}

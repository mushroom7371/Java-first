package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//전투 드로이드 가격
public class N5361 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        double priceOfBlasterRifle = 350.34;
        double priceOfVisualSensor = 230.90;
        double priceOfHearingSensor = 190.55;
        double priceOfArm = 125.30;
        double priceOfLeg = 180.90;

        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine());
            int numberOfBlasterRifle = Integer.parseInt(st.nextToken());
            int numberOfVisualSensor = Integer.parseInt(st.nextToken());
            int numberOfHearingSensor = Integer.parseInt(st.nextToken());
            int numberOfArm = Integer.parseInt(st.nextToken());
            int numberOfLeg = Integer.parseInt(st.nextToken());

            double sum = (priceOfBlasterRifle*numberOfBlasterRifle) + (priceOfVisualSensor*numberOfVisualSensor)
                    + (priceOfHearingSensor*numberOfHearingSensor) + (priceOfArm*numberOfArm) + (priceOfLeg*numberOfLeg);

            bw.write("$" + String.format("%.2f", sum) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5361().solution();
    }
}

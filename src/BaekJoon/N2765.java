package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//자전거 속도
public class N2765 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        while (true) {
            count++;
            StringTokenizer st = new StringTokenizer(br.readLine());
            double wheel = Double.parseDouble(st.nextToken());
            int rotation = Integer.parseInt(st.nextToken());
            double time = Double.parseDouble(st.nextToken());

            if (rotation == 0) {
                break;
            }

            double distance = wheel * Math.PI * rotation / 63360;
            double mph = distance / time * 3600;
            bw.write("Trip #" + count + ": " + String.format("%.2f", distance) + " " + String.format("%.2f", mph) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2765().solution();
    }
}

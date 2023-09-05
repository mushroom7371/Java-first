package BaekJoon;

import java.io.*;

//24
public class N1408 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] currentTimeArray = br.readLine().split(":");
        String[] startTimeArray = br.readLine().split(":");
        int currentTime = Integer.parseInt(currentTimeArray[0]) * 3600 + Integer.parseInt(currentTimeArray[1]) * 60 + Integer.parseInt(currentTimeArray[2]);
        int startTime = Integer.parseInt(startTimeArray[0]) * 3600 + Integer.parseInt(startTimeArray[1]) * 60 + Integer.parseInt(startTimeArray[2]);
        int temp = startTime - currentTime;

        if (currentTime < startTime) {
            bw.write(String.format("%02d:%02d:%02d", temp / 3600, (temp % 3600) / 60, temp % 60));
        } else {
            temp = 24 * 3600 - currentTime + startTime;
            bw.write(String.format("%02d:%02d:%02d", temp / 3600, (temp % 3600) / 60, temp % 60));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1408().solution();
    }
}

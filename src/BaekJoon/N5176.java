package BaekJoon;

import java.io.*;
import java.util.*;

//대회 자리
public class N5176 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numberOfPeople = Integer.parseInt(st.nextToken());
            int numberOfSeat = Integer.parseInt(st.nextToken());

            Map<Integer, Boolean> seatMap = new HashMap<>();
            for (int i = 1; i <= numberOfSeat; i++) {
                seatMap.put(i, false);
            }

            int result = 0;
            for (int i = 0; i < numberOfPeople; i++) {
                int seatNumber = Integer.parseInt(br.readLine());

                if (!seatMap.get(seatNumber)) {
                    seatMap.put(seatNumber, true);
                } else {
                    result++;
                }
            }

            bw.write(result + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5176().solution();
    }
}

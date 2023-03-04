package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//소가 길을 건너간 이유
public class N14467 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int [] cowArray = new int[11];
        Map<Integer, Integer> cowMap = new HashMap<>();

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cowNumber = Integer.parseInt(st.nextToken());
            int cowPosition = Integer.parseInt(st.nextToken());

            if (cowMap.containsKey(cowNumber)) {
                if (cowMap.get(cowNumber) != cowPosition) {
                    cowMap.put(cowNumber, cowPosition);
                    cowArray[cowNumber]++;
                }
            } else {
                cowMap.put(cowNumber, cowPosition);
            }
        }

        int count = 0;
        for (int i = 1; i < cowArray.length; i++) {
            if (cowArray[i] != 0) {
                count += cowArray[i];
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14467().solution();
    }
}

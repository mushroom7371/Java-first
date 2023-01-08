package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//핸드폰 요금
public class N1267 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] paymentSystemArray = new int[2];
        int youngSikCriteria = 30;
        int minSikCriteria = 60;

        while (testCase --> 0) {
            int callTime = Integer.parseInt(st.nextToken());

            paymentSystemArray[0] += ((callTime/youngSikCriteria) + 1) * 10;
            paymentSystemArray[1] += ((callTime/minSikCriteria) + 1) * 15;
        }

        if (paymentSystemArray[0] > paymentSystemArray[1]) {
            bw.write("M " + paymentSystemArray[1]);
        } else if (paymentSystemArray[0] < paymentSystemArray[1]) {
            bw.write("Y " + paymentSystemArray[0]);
        } else {
            bw.write("Y M " + paymentSystemArray[0]);
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1267().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//TGN
public class N5063 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (testCase --> 0) {
            st = new StringTokenizer(br.readLine());
            int noAdvertisingRevenue = Integer.parseInt(st.nextToken());
            int AdvertisingRevenue = Integer.parseInt(st.nextToken());
            int advertisingCosts = Integer.parseInt(st.nextToken());

            int result = noAdvertisingRevenue - (AdvertisingRevenue - advertisingCosts);

            if (result < 0) {
                bw.write("advertise\n");
            } else if (result == 0) {
                bw.write("does not matter\n");
            } else {
                bw.write("do not advertise\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5063().solution();
    }
}

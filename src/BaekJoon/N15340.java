package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Sim Card
public class N15340 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int parsTelCall = 30;
        int parsTelData = 40;

        int parsCellCall = 35;
        int parsCellData = 30;

        int parsPhoneCall = 40;
        int parsPhoneData = 20;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int call = Integer.parseInt(st.nextToken());
            int data = Integer.parseInt(st.nextToken());

            if (call == 0 && data == 0) {
                break;
            }

            int parsTelSum = call * parsTelCall + data * parsTelData;
            int parsCellSum = call * parsCellCall + data * parsCellData;
            int parsPhoneSum = call * parsPhoneCall + data * parsPhoneData;

            int min = Math.min(parsTelSum, Math.min(parsCellSum, parsPhoneSum));
            bw.write(min + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15340().solution();
    }
}

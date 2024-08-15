package BaekJoon;

import java.io.*;

//좌석 배치도
public class N30889 {
    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] seat = new String[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                seat[i][j] = ".";
            }
        }

        int testCase = Integer.parseInt(br.readLine());
        int seatH = 0;
        int seatNum = 0;

        for (int i = 0; i < testCase; i++) {
            String seatInfo = br.readLine();
            seatH = seatInfo.charAt(0) - 65;
            seatNum = seatInfo.charAt(1) - 48;
            int d = 0;
            if(seatInfo.length() == 3) {
                d = seatInfo.charAt(2) - 48;
                seatNum *= 10;
                seatNum += d;
            }
            seat[seatH][seatNum - 1] = "o";
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                bw.write(seat[i][j]);
                if (j == 19) {
                    bw.write("\n");
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30889().solution();
    }
}

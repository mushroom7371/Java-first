package BaekJoon;

import java.io.*;

//최장 스트릭
public class N29752 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int days = Integer.parseInt(br.readLine());
        String[] scores = br.readLine().split(" ");

        int max = 0;
        int result = 0;
        for (int i = 0; i < days; i++) {
            if (scores[i].equals("0")) {
                result = 0;
            } else {
                result++;
                max = Math.max(max, result);
            }
        }

        bw.write(max + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29752().solution();
    }
}

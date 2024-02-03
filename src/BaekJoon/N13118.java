package BaekJoon;

import java.io.*;
import java.util.Arrays;

//뉴턴과 사과
public class N13118 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] peopleInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] appleInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = appleInfo[0];
        int y = appleInfo[1];
        int r = appleInfo[2];

        int result = 0;
        for (int i = 0; i < 4; i++) {
            if (peopleInfo[i] == x) {
                result = i + 1;
                break;
            }
        }

        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N13118().solution();
    }
}

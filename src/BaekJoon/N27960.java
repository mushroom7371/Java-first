package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//사격 내기
public class N27960 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int scoreA = Integer.parseInt(st.nextToken());
        int scoreB = Integer.parseInt(st.nextToken());
        long binaryA = Long.parseLong(Integer.toBinaryString(scoreA));
        long binaryB = Long.parseLong(Integer.toBinaryString(scoreB));
        String binarySum = String.valueOf(binaryA + binaryB);
        int result = 0;

        for (int i = binarySum.length()-1; i >= 0; i--) {
            if (binarySum.charAt(i) == '1') {
                result += Math.pow(2, binarySum.length()-1-i);
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27960().solution();
    }
}

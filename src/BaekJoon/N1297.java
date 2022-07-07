package BaekJoon;

import java.io.*;
import java.util.Arrays;

//TV 크기
public class N1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] tvInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int diagonal = tvInfo[0];
        int height = tvInfo[1];
        int width = tvInfo[2];

        double result = Math.pow(diagonal, 2) / ((Math.pow(height, 2)) + Math.pow(width, 2));

        bw.write((int)Math.sqrt(result * Math.pow(height, 2)) + " " + (int)Math.sqrt(result * Math.pow(width, 2)));
        br.close();
        bw.flush();
        bw.close();

    }
}

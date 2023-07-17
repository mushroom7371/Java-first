package BaekJoon;

import java.io.*;
import java.util.Arrays;

//킹, 퀸, 룩, 비숍, 나이트, 폰
public class N3003 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] chessPiecesArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] resultArray = new int[6];

        for (int i = 0; i < chessPiecesArray.length; i++) {
            switch (i) {
                case 0:
                    resultArray[i] = 1 - chessPiecesArray[i];
                    break;
                case 1:
                    resultArray[i] = 1 - chessPiecesArray[i];
                    break;
                case 2:
                    resultArray[i] = 2 - chessPiecesArray[i];
                    break;
                case 3:
                    resultArray[i] = 2 - chessPiecesArray[i];
                    break;
                case 4:
                    resultArray[i] = 2 - chessPiecesArray[i];
                    break;
                case 5:
                    resultArray[i] = 8 - chessPiecesArray[i];
                    break;
            }
        }

        for (int i = 0; i < resultArray.length; i++) {
            bw.write(resultArray[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N3003().solution();
    }
}

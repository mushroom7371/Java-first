package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//아스키 코드
public class N17072 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < row; i++) {
            int [] rowArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int j = 0; j < rowArray.length; j += 3) {
                int intensity = changeRgbToIntensity(rowArray[j], rowArray[j+1], rowArray[j+2]);
                char changed = changeIntensityToChar(intensity);
                result.append(changed);
            }

            result.append("\n");
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    int changeRgbToIntensity(int r, int g, int b) {
        return 2126*r + 7152*g + 722*b;
    }

    char changeIntensityToChar(int intensity) {
        char result = '.';

        if (intensity < 510000) {
            result = '#';
        } else if (intensity < 1020000) {
            result = 'o';
        } else if (intensity < 1530000) {
            result = '+';
        } else if (intensity < 2040000) {
            result = '-';
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        new N17072().solution();
    }
}

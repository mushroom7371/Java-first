package BaekJoon;

import java.io.*;
import java.util.Arrays;

//음계
public class N2920 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] inputArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != i + 1) {
                isAscending = false;
                break;
            }
        }

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 8-i) {
                isDescending = false;
                break;
            }
        }

        if (isAscending) {
            bw.write("ascending");
        } else if (isDescending) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2920().solution();
    }
}

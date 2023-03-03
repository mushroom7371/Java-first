package BaekJoon;

import java.io.*;

//별 찍기 - 21
public class N10996 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        String [][] starArray = new String[input*2][input];

        for (int i = 0; i < starArray.length; i++) {
            for (int j = 0; j < starArray[i].length; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        starArray[i][j] = "*";
                    } else {
                        starArray[i][j] = " ";
                    }
                } else {
                    if (j % 2 != 0) {
                        starArray[i][j] = " ";
                    } else {
                        starArray[i][j] = "*";
                    }
                }
            }
        }

        for (int i = 0; i < starArray.length; i++) {
            for (int j = 0; j < starArray[i].length; j++) {
                bw.write(starArray[i][j]);
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10996().solution();
    }
}

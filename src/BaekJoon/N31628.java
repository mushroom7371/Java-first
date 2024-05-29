package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//가지 한 두름 주세요
public class N31628 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] inputArr = new String[10][10];
        boolean isFound = false;

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean isFoundInRow = true;
            String zeroValue = st.nextToken();
            inputArr[i][0] = zeroValue;

            for (int j = 1; j < 10; j++){
                inputArr[i][j] = st.nextToken();
                if (!inputArr[i][j].equals(zeroValue)) {
                    isFoundInRow = false;
                }
            }

            if (isFoundInRow) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            bw.write("1");
        } else {
            for (int i = 0; i < 10; i++) {
                boolean isFoundInColumn = true;
                String zeroValue = inputArr[0][i];

                for (int j = 1; j < 10; j++) {
                    if (!inputArr[j][i].equals(zeroValue)) {
                        isFoundInColumn = false;
                    }
                }

                if (isFoundInColumn) {
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                bw.write("1");
            } else {
                bw.write("0");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31628().solution();
    }
}

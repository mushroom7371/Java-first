package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//준오는 조류혐오야!!
public class N14647 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        String [][] bingoArray = new String[row][column];
        int totalNumberOfNine = 0;
        int numberOfNine = 0;

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            int tempNine = 0;

            for (int j = 0; j < column; j++) {
                String temp = st.nextToken();
                bingoArray[i][j] = temp;

                for (int k = 0; k < temp.length(); k++) {
                    if (temp.charAt(k) == '9') {
                        totalNumberOfNine++;
                        tempNine++;
                    }
                }
            }

            if (numberOfNine < tempNine) {
                numberOfNine = tempNine;
            }
        }

        for (int i = 0; i < column; i++) {
            int tempNine = 0;

            for (int j = 0; j < row; j++) {
                String temp = bingoArray[j][i];

                for (int k = 0; k < temp.length(); k++) {
                    if (temp.charAt(k) == '9') {
                        tempNine++;
                    }
                }
            }

            if (numberOfNine < tempNine) {
                numberOfNine = tempNine;
            }
        }

        totalNumberOfNine -= numberOfNine;

        bw.write(totalNumberOfNine + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N14647().solution();
    }
}

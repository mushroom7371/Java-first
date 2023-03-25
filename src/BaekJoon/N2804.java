package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//크로스워드 만들기
public class N2804 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String rowString = st.nextToken();
        String columnString = st.nextToken();
        char [][] resultArray = new char[columnString.length()][rowString.length()];

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                resultArray[i][j] = '.';
            }
        }

        int rowIndex = 0;
        int columnIndex = 0;
        loop:
        for (int i = 0; i < rowString.length(); i++) {
            char tempRowChar = rowString.charAt(i);

            for (int j = 0; j < columnString.length(); j++) {
                char tempColumnChar = columnString.charAt(j);

                if (tempRowChar == tempColumnChar) {
                    rowIndex = j;
                    columnIndex = i;
                    break loop;
                }
            }
        }

        for (int i = 0; i < rowString.length(); i++) {
            resultArray[rowIndex][i] = rowString.charAt(i);
        }

        for (int i = 0; i < columnString.length(); i++) {
            resultArray[i][columnIndex] = columnString.charAt(i);
        }

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                bw.write(resultArray[i][j]);
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2804().solution();
    }
}

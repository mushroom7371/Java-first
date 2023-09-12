package BaekJoon;

import java.io.*;

//암호
public class N1855 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfColumn = Integer.parseInt(br.readLine());
        String encryptedString = br.readLine();
        char[][] matrix = new char[encryptedString.length() / numberOfColumn][numberOfColumn];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                char c = encryptedString.charAt(i * numberOfColumn + j);
                if (i % 2 == 0) {
                    matrix[i][j] = c;
                } else {
                    matrix[i][numberOfColumn - j - 1] = c;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfColumn; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result.append(matrix[j][i]);
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1855().solution();
    }
}

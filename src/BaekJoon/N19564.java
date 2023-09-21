package BaekJoon;

import java.io.*;

//반복
public class N19564 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] inputArray = br.readLine().toCharArray();

        int count = 1;
        char previousChar = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            char currentChar = inputArray[i];

            if (currentChar - previousChar <= 0) {
                count++;
            }

            previousChar = currentChar;
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N19564().solution();
    }
}

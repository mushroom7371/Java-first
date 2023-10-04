package BaekJoon;

import java.io.*;

//요다
public class N5363 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfQueries = Integer.parseInt(br.readLine());

        for (int i = 0; i < numberOfQueries; i++) {
            String[] inputArray = br.readLine().split(" ");

            for (int j = 2; j < inputArray.length; j++) {
                bw.write(inputArray[j] + " ");
            }

            bw.write(inputArray[0] + " " + inputArray[1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5363().solution();
    }
}

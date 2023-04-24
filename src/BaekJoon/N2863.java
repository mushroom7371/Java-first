package BaekJoon;

import java.io.*;
import java.util.Arrays;

//이게 분수?
public class N2863 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double [][] inputArray = new double[2][2];

        for (int i = 0; i < 2; i++) {
            inputArray[i] = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        }

        double [] resultArray = new double[4];
        resultArray[0] = inputArray[0][0]/inputArray[1][0] + inputArray[0][1]/inputArray[1][1];
        double max = resultArray[0];

        for (int i = 1; i < 4; i++) {
            double temp1 = inputArray[0][1];
            double temp2 = inputArray[1][1];
            inputArray[0][1] = inputArray[0][0];
            inputArray[1][1] = temp1;
            temp1 = inputArray[1][0];
            inputArray[1][0] = temp2;
            inputArray[0][0] = temp1;

            resultArray[i] = inputArray[0][0]/inputArray[1][0] + inputArray[0][1]/inputArray[1][1];
            if (max < resultArray[i]) {
                max = resultArray[i];
            }
        }

        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] == max) {
                bw.write(i + "");
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2863().solution();
    }
}

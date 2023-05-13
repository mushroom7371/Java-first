package BaekJoon;

import java.io.*;
import java.util.Arrays;

//중복을 없애자
public class N4592 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while (!(input = br.readLine()).equals("0")) {
            int[] inputArray = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            StringBuilder sb = new StringBuilder();

            if (inputArray.length == 2) {
                sb.append(inputArray[1] + " ");
            } else {
                int temp = inputArray[1];
                sb.append(temp + " ");

                for (int i = 2; i <= inputArray[0]; i++) {
                    if (temp != inputArray[i]) {
                        sb.append( inputArray[i] + " ");
                        temp = inputArray[i];
                    }
                }
            }

            sb.append("$\n");
            bw.write(String.valueOf(sb));
        }


        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N4592().solution();
    }
}

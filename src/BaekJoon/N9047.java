package BaekJoon;

import java.io.*;
import java.util.Arrays;

//6174
public class N9047 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            boolean is6174 = false;
            StringBuilder sb = new StringBuilder(br.readLine());

            if (String.valueOf(sb).equals("6174")) {
                bw.write("0\n");
                continue;
            }
            int count = 0;
            while (!is6174) {
                String[] numberArray = sb.toString().split("");
                Arrays.sort(numberArray);
                int max = Integer.parseInt(numberArray[3] + numberArray[2] + numberArray[1] + numberArray[0]);
                int min = Integer.parseInt(numberArray[0] + numberArray[1] + numberArray[2] + numberArray[3]);
                int result = max - min;

                if (result == 6174) {
                    count++;
                    is6174 = true;
                } else {
                    sb = new StringBuilder(String.valueOf(result));
                    if (sb.length() < 4) {
                        for (int i = 0; i < 4 - sb.length(); i++) {
                            sb.insert(0, "0");
                        }
                    }
                    count++;
                }
            }

            bw.write(count + "\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9047().solution();
    }
}

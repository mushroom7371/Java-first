package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//수들의 합 2
public class N2003 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer((br.readLine()));
        int numberOfNumbers = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;

        for (int i = 0; i < numberOfNumbers; i++) {
            int sum = 0;
            for (int j = i; j < numberOfNumbers; j++) {
                sum += numbers[j];
                if (sum == target) {
                    count++;
                    break;
                } else if (sum > target) {
                    break;
                }
            }
        }

        bw.write(count + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2003().solution();
    }
}

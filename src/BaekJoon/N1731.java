package BaekJoon;

import java.io.*;

//추론
public class N1731 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfSequence = Integer.parseInt(br.readLine());
        boolean isSameDifference = true;
        int[] sequence = new int[numberOfSequence];

        for (int i = 0; i < numberOfSequence; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < numberOfSequence - 2; i++) {
            if (sequence[i + 1] - sequence[i] != sequence[i + 2] - sequence[i + 1]) {
                isSameDifference = false;
                break;
            }
        }

        if (isSameDifference) {
            bw.write(String.valueOf(sequence[numberOfSequence - 1] + (sequence[1] - sequence[0])));
        } else {
            bw.write(String.valueOf(sequence[numberOfSequence - 1] * (sequence[1] / sequence[0])));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1731().solution();
    }
}

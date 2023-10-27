package BaekJoon;

import java.io.*;

//슈퍼 마리오
public class N2851 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfMushroom = 10;
        int[] mushroomArray = new int[numberOfMushroom];

        for (int i = 0; i < mushroomArray.length; i++) {
            mushroomArray[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;
        int currentSum = 0;
        for (int i = 0; i < mushroomArray.length; i++) {
            currentSum += mushroomArray[i];
            if (currentSum >= 100) {
                if (currentSum - 100 > 100 - (currentSum - mushroomArray[i])) {
                    result = currentSum - mushroomArray[i];
                } else {
                    result = currentSum;
                }
                break;
            }
        }

        if (result == 0) {
            result = currentSum;
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2851().solution();
    }
}

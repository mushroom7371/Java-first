package BaekJoon;

import java.io.*;

//트로피 진열
public class N1668 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfTrophy = Integer.parseInt(br.readLine());
        int [] trophyArray = new int[numberOfTrophy];
        int maxSize = 0;
        int numberOfViewCount = 0;

        for (int i = 0; i < numberOfTrophy; i++) {
            trophyArray[i] = Integer.parseInt(br.readLine());
            if (maxSize < trophyArray[i]) {
                maxSize = trophyArray[i];
                numberOfViewCount++;
            }
        }

        bw.write(numberOfViewCount + "\n");
        maxSize = 0;
        numberOfViewCount = 0;
        for (int i = numberOfTrophy-1; i >= 0; i--) {
            if (maxSize < trophyArray[i]) {
                maxSize = trophyArray[i];
                numberOfViewCount++;
            }
        }
        bw.write(numberOfViewCount + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1668().solution();
    }
}

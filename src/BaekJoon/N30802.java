package BaekJoon;

import java.io.*;
import java.util.Arrays;

//웰컴 키트
public class N30802 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfPeople = Integer.parseInt(br.readLine());
        int[] numberOfPeopleByTshirtSize = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bundleInfo = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numberOfTshirtBundle = bundleInfo[0];
        int numberOfPencilBundle = bundleInfo[1];

        int tshirtCount = 0;
        for (int i = 0; i < numberOfPeopleByTshirtSize.length; i++) {
            int count = (numberOfPeopleByTshirtSize[i] / numberOfTshirtBundle) + 1;
            if (numberOfPeopleByTshirtSize[i] % numberOfTshirtBundle == 0) {
                count--;
            }
            tshirtCount += count;
        }

        bw.write(tshirtCount + "\n" + (numberOfPeople / numberOfPencilBundle) + " " + (numberOfPeople % numberOfPencilBundle));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30802().solution();
    }
}

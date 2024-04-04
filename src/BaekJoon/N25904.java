package BaekJoon;

import java.io.*;
import java.util.*;

//안녕 클레오파트라 세상에서 제일가는 포테이토칩
public class N25904 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfPeople = Integer.parseInt(st.nextToken());
        int volume = Integer.parseInt(st.nextToken()) -1;
        int[] volumeOfPeople = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int resultIndex = -1;
        while (true) {
            for (int i = 0; i < numberOfPeople; i++) {
                volume++;
                if (volumeOfPeople[i] < volume) {
                    resultIndex = i;
                    break;
                }
            }

            if (resultIndex != -1) {
                break;
            }
        }

        bw.write(String.valueOf(resultIndex + 1));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25904().solution();
    }
}

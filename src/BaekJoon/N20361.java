package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//일우는 야바위꾼
public class N20361 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfCup = Integer.parseInt(st.nextToken());
        int targetCup = Integer.parseInt(st.nextToken());
        int numberOfSwap = Integer.parseInt(st.nextToken());
        int[] cup = new int[numberOfCup + 1];
        cup[targetCup] = 1;

        for (int i = 0; i < numberOfSwap; i++) {
            st = new StringTokenizer(br.readLine());
            int firstCup = Integer.parseInt(st.nextToken());
            int secondCup = Integer.parseInt(st.nextToken());
            int temp = cup[firstCup];
            cup[firstCup] = cup[secondCup];
            cup[secondCup] = temp;
        }

        for (int i = 0; i < cup.length; i++) {
            if (cup[i] == 1) {
                bw.write(String.valueOf(i));
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N20361().solution();
    }
}

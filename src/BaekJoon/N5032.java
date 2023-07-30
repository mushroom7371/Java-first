package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//탄산 음료
public class N5032 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int emptyBottle = Integer.parseInt(st.nextToken());
        int findBottle = Integer.parseInt(st.nextToken());
        int requiredBottle = Integer.parseInt(st.nextToken());

        int totalBottle = emptyBottle + findBottle;
        int drinkBottle = 0;
        while (totalBottle >= requiredBottle) {
            int newBottle = totalBottle / requiredBottle;
            drinkBottle += newBottle;
            totalBottle = newBottle + totalBottle % requiredBottle;
        }

        bw.write(drinkBottle + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N5032().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//선물
public class N28281 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int days = Integer.parseInt(st.nextToken());
        int numberOfGift = Integer.parseInt(st.nextToken());
        int[] priceOfGift = new int[days];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < days; i++) {
            priceOfGift[i] = Integer.parseInt(st.nextToken());
        }

        int total = Integer.MAX_VALUE;
        for (int i = 0; i < days -1; i++) {
            int temp = (priceOfGift[i] + priceOfGift[i+1]) * numberOfGift;
            total = Math.min(total, temp);
        }

        bw.write(total + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28281().solution();
    }
}

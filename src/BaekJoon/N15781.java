package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//헬멧과 조끼
public class N15781 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfHelmet = Integer.parseInt(st.nextToken());
        int numberOfVest = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int maxHelmetDefense = 0;
        for (int i = 0; i < numberOfHelmet; i++) {
            int defense = Integer.parseInt(st.nextToken());

            if (defense > maxHelmetDefense) {
                maxHelmetDefense = defense;
            }
        }

        st = new StringTokenizer(br.readLine());
        int maxVestDefense = 0;
        for (int i = 0; i < numberOfVest; i++) {
            int defense = Integer.parseInt(st.nextToken());

            if (defense > maxVestDefense) {
                maxVestDefense = defense;
            }
        }

        bw.write(maxHelmetDefense + maxVestDefense + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N15781().solution();
    }
}

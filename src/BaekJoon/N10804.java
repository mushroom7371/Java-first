package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//카드 역배치
public class N10804 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] cardDeck = new int[21];
        int testCase = 10;

        for (int i = 0; i <= 20; i++) {
            cardDeck[i] = i;
        }

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken());
            int endIndex = Integer.parseInt(st.nextToken());

            for (int i = 0; i < (endIndex-startIndex)/2 + 1; i++) {
                int temp = cardDeck[startIndex+i];
                cardDeck[startIndex+i] = cardDeck[endIndex-i];
                cardDeck[endIndex-i] = temp;
            }
        }

        for (int i = 1; i <= 20; i++) {
            bw.write(cardDeck[i] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10804().solution();
    }
}

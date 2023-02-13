package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//첼시를 도와줘!
public class N11098 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int numberOfPlayer = Integer.parseInt(br.readLine());
            int maxPrice = 0;
            String targetPlayerName = "";

            for (int i = 0; i < numberOfPlayer; i++) {
                st = new StringTokenizer(br.readLine());
                int price = Integer.parseInt(st.nextToken());
                String playerName = st.nextToken();

                if (maxPrice <= price) {
                    maxPrice = price;
                    targetPlayerName = playerName;
                }
            }

            bw.write(targetPlayerName + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11098().solution();
    }
}

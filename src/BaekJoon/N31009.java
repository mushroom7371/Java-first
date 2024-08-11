package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//진주로 가자! (Easy)
public class N31009 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Map<String, Integer> info = new HashMap<>();

        int jinjuPrice = 0;
        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String goal = st.nextToken();
            int price = Integer.parseInt(st.nextToken());

            if (goal.equals("jinju")) {
                jinjuPrice = price;
            }

            info.put(goal, price);
        }

        int overPriceCount = 0;
        for (Map.Entry<String, Integer> entry : info.entrySet()) {
            if (entry.getValue() > jinjuPrice) {
                overPriceCount++;
            }
        }

        bw.write(jinjuPrice + "\n" + overPriceCount);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31009().solution();
    }
}

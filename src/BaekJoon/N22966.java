package BaekJoon;

import java.io.*;
import java.util.*;

//가장 쉬운 문제를 찾는 문제
public class N22966 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        Map<String, Integer> questionMap = new HashMap<>();
        int minLevel = Integer.MAX_VALUE;

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String question = st.nextToken();
            int level = Integer.parseInt(st.nextToken());

            if (level < minLevel) {
                minLevel = level;
            }

            questionMap.put(question, level);
        }

        for (String key : questionMap.keySet()) {
            if (questionMap.get(key) == minLevel) {
                bw.write(key);
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N22966().solution();
    }
}

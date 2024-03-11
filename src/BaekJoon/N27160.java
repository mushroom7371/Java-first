package BaekJoon;

import java.io.*;
import java.util.*;

//할리갈리
public class N27160 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        Map<String, Integer> fruitMap = new HashMap<>();
        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int numberOfFruit = Integer.parseInt(st.nextToken());
            fruitMap.put(fruit, fruitMap.getOrDefault(fruit, 0) + numberOfFruit);
        }

        boolean isHalliGalli = false;
        for (String key : fruitMap.keySet()) {
            if (fruitMap.get(key) == 5) {
                isHalliGalli = true;
                break;
            }
        }

        if (isHalliGalli) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N27160().solution();
    }
}

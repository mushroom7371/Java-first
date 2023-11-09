package BaekJoon;

import java.io.*;
import java.util.*;

//철벽 보안 알고리즘
public class N9322 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            int numberOfWord = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            Map<String, Integer> firstPublicKey = new HashMap<>();
            for (int i = 0; i < numberOfWord; i++) {
                firstPublicKey.put(st.nextToken(), i);
            }

            st = new StringTokenizer(br.readLine());
            int[] secondPublicKey = new int[numberOfWord];
            for (int i = 0; i < numberOfWord; i++) {
                String key = st.nextToken();
                secondPublicKey[i] = firstPublicKey.get(key);
            }

            st = new StringTokenizer(br.readLine());
            String[] message = new String[numberOfWord];
            for (int i = 0; i < numberOfWord; i++) {
                message[secondPublicKey[i]] = st.nextToken();
            }

            for (int i = 0; i < numberOfWord; i++) {
                bw.write(message[i] + " ");
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9322().solution();
    }
}

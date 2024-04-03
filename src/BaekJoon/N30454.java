package BaekJoon;

import java.io.*;
import java.util.*;

//얼룩말을 찾아라!
public class N30454 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfZebra = Integer.parseInt(st.nextToken());
        int lengthOfZebra = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> zebraInfoMap = new HashMap<>();

        int max = 0;
        for (int i = 0; i < numberOfZebra; i++) {
            String stateOfZebra = br.readLine();

            st = new StringTokenizer(stateOfZebra, "0");
            int countOfBlack = st.countTokens();
            zebraInfoMap.put(countOfBlack, zebraInfoMap.getOrDefault(countOfBlack, 0) + 1);
            max = Math.max(max, countOfBlack);
        }

        bw.write(max + " " + zebraInfoMap.get(max));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30454().solution();
    }
}
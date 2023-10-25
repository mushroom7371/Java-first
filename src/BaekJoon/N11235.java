package BaekJoon;

import java.io.*;
import java.util.*;

//Polling
public class N11235 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfCandidate = Integer.parseInt(br.readLine());
        Map<String, Integer> candidateMap = new HashMap<>();

        for (int i = 0; i < numberOfCandidate; i++) {
            String name = br.readLine();

            if (candidateMap.containsKey(name)) {
                candidateMap.put(name, candidateMap.get(name) + 1);
            } else {
                candidateMap.put(name, 1);
            }
        }

        int max = 0;
        for (String key : candidateMap.keySet()) {
            if (candidateMap.get(key) > max) {
                max = candidateMap.get(key);
            }
        }

        List<String> result = new ArrayList<>();
        for (String key : candidateMap.keySet()) {
            if (candidateMap.get(key) == max) {
                result.add(key);
            }
        }

        Collections.sort(result);
        for (String name : result) {
            bw.write(name + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11235().solution();
    }
}

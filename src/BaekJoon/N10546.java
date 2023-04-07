package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//배부른 마라토너
public class N10546 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfMarathoner = Integer.parseInt(br.readLine());
        Map<String, Integer> marathonerMap = new HashMap<>();

        for (int i = 0; i < numberOfMarathoner; i++) {
            String name = br.readLine();

            if (marathonerMap.containsKey(name)) {
                marathonerMap.put(name, marathonerMap.get(name) + 1);
            } else {
                marathonerMap.put(name, 1);
            }
        }

        for (int i = 0; i < numberOfMarathoner-1; i++) {
            String name = br.readLine();

            if (marathonerMap.containsKey(name)) {
                marathonerMap.put(name, marathonerMap.get(name) - 1);
            }
        }

        for (String name : marathonerMap.keySet()) {
            if (marathonerMap.get(name) != 0) {
                bw.write(name);
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10546().solution();
    }
}

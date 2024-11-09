package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//HI-ARC
public class N26004 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        String input = br.readLine();
        Map<Character, Integer> targetCharMap = new HashMap<>();
        targetCharMap.put('H', 0);
        targetCharMap.put('I', 0);
        targetCharMap.put('A', 0);
        targetCharMap.put('R', 0);
        targetCharMap.put('C', 0);

        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (targetCharMap.containsKey(c)) {
                targetCharMap.put(c, targetCharMap.get(c) + 1);
            }
        }

        int min = 100000;
        for (Map.Entry<Character, Integer> entry : targetCharMap.entrySet()) {
            min = Math.min(min, entry.getValue());
        }

        bw.write(min + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N26004().solution();
    }
}

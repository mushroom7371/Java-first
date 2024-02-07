package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//개수 세기
public class N10807 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfNumbers = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < numberOfNumbers; i++) {
            int number = Integer.parseInt(st.nextToken());
            numbers.put(number, numbers.getOrDefault(number, 0) + 1);
        }

        int targetNumber = Integer.parseInt(br.readLine());
        bw.write(numbers.getOrDefault(targetNumber, 0) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10807().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.*;

//2+1 세일
public class N11508 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        List<Integer> productList = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            productList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(productList, Collections.reverseOrder());

        int sum = 0;
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            for (int j = 0; j < 3; j++) {
                if (index >= productList.size()) {
                    break;
                }
                if (j != 2) {
                    sum += productList.get(index);
                }
                index++;
            }
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11508().solution();
    }
}

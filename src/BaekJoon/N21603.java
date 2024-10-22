package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//K 2K 게임
public class N21603 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> resultList = new ArrayList<>();

        int fk = k % 10;
        int f2k = (2 * k) % 10;
        for (int i = 1; i <= n; i++) {
            if (i % 10 != fk && i % 10 != f2k) {
                resultList.add(i);
            }
        }

        bw.write(resultList.size() + "\n");
        for (Integer integer : resultList) {
            bw.write(integer + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N21603().solution();
    }
}

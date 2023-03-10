package BaekJoon;

import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

//영화 평가
public class N23278 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        List<Integer> scoreList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());

            scoreList.add(score);
        }

        Collections.sort(scoreList);

        for (int i = 0; i < L; i++) {
            scoreList.remove(0);
        }

        for (int i = 0; i < H; i++) {
            scoreList.remove(scoreList.size()-1);
        }

        int sum = 0;
        for (int i = 0; i < scoreList.size(); i++) {
            sum += scoreList.get(i);
        }

        BigDecimal a = new BigDecimal(sum);
        BigDecimal b = new BigDecimal(scoreList.size());

        bw.write(String.valueOf(a.divide(b, MathContext.DECIMAL64)));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23278().solution();
    }
}

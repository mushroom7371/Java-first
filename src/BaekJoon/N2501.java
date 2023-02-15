package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//약수 구하기
public class N2501 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int targetNumber = Integer.parseInt(st.nextToken());
        int targetSequence = Integer.parseInt(st.nextToken());
        List<Integer> divisorList = new ArrayList<>();

        for (int i = 1; i <= targetNumber; i++) {
            if (targetNumber % i == 0) {
                divisorList.add(i);
            }
        }

        if (divisorList.size() < targetSequence) {
            bw.write("0");
        } else {
            bw.write(divisorList.get(targetSequence - 1) + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2501().solution();
    }
}

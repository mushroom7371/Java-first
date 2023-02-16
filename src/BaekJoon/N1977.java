package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//완전제곱수
public class N1977 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int startNumber = Integer.parseInt(br.readLine());
        int endNumber = Integer.parseInt(br.readLine());
        List<Integer> resultList = new ArrayList<>();
        int sum = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            double temp = i;

            if (Math.sqrt(temp) % 1 == 0) {
                resultList.add(i);
            }
        }

        if (resultList.isEmpty()) {
            bw.write("-1");
        } else {
            for (int i = 0; i < resultList.size(); i++) {
                sum += resultList.get(i);
            }

            bw.write(sum + "\n" + resultList.get(0));
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1977().solution();
    }
}

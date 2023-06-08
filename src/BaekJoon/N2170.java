package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//선 긋기
public class N2170 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        List<int []> lines = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            String[] line = br.readLine().split(" ");
            lines.add(new int[]{Integer.parseInt(line[0]), Integer.parseInt(line[1])});
        }

        lines.sort((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Integer.compare(o1[1], o2[1]);
            }
            return Integer.compare(o1[0], o2[0]);
        });

        int totalLength = 0;
        int start = lines.get(0)[0];
        int end = lines.get(0)[1];

        for (int i = 0; i < testCase-1; i++) {
            int tempStart = lines.get(i+1)[0];
            int tempEnd = lines.get(i+1)[1];

            if (tempStart <= end) {
                if (tempEnd > end) {
                    end = tempEnd;
                }
            } else {
                totalLength += end - start;
                start = tempStart;
                end = tempEnd;
            }
        }

        bw.write(totalLength + end - start + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2170().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//시간과 날짜
public class N25024 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if (first >= 0 && first <= 23 && second >= 0 && second <= 59) {
                bw.write("Yes ");
            } else {
                bw.write("No ");
            }

            if (first >= 1 && first <= 12) {
                if (first == 1 || first == 3 || first == 5 || first == 7 || first == 8 || first == 10 || first == 12) {
                    if (second >= 1 && second <= 31) {
                        bw.write("Yes\n");
                    } else {
                        bw.write("No\n");
                    }
                } else if (first == 4 || first == 6 || first == 9 || first == 11) {
                    if (second >= 1 && second <= 30) {
                        bw.write("Yes\n");
                    } else {
                        bw.write("No\n");
                    }
                } else {
                    if (second >= 1 && second <= 29) {
                        bw.write("Yes\n");
                    } else {
                        bw.write("No\n");
                    }
                }
            } else {
                bw.write("No\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N25024().solution();
    }
}

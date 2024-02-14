package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//브실이와 친구가 되고 싶어
public class N29736 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int people = 0;
        for (int i = k - x; i < k + x + 1; i++) {
            if (i < a || i > b) {
               continue;
            }
            people++;
        }

        if (people == 0) {
            bw.write("IMPOSSIBLE");
        } else {
            bw.write(people + "");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29736().solution();
    }
}

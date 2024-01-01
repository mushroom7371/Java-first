package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//영식이와 친구들
public class N1592 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] count = new int[N];
        int result = 0;
        int index = 0;

        while (true) {
            count[index]++;
            if (count[index] == M) {
                break;
            }
            if (count[index] % 2 == 1) {
                index = (index + L) % N;
            } else {
                index = (index - L + N) % N;
            }
            result++;
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1592().solution();
    }
}

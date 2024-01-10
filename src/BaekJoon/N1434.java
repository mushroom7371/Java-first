package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//책 정리
public class N1434 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfBoxes = Integer.parseInt(st.nextToken());
        int numberOfBooks = Integer.parseInt(st.nextToken());
        int[] boxes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] books = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int book : books) {
            for (int i = 0; i < numberOfBoxes; i++) {
                if (boxes[i] >= book) {
                    boxes[i] -= book;
                    break;
                }
            }
        }

        int result = 0;

        for (int box : boxes) {
            result += box;
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1434().solution();
    }
}

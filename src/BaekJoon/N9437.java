package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

//사라진 페이지 찾기
public class N9437 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }

            StringTokenizer st = new StringTokenizer(input);
            int totalPage = Integer.parseInt(st.nextToken());
            int targetPage = Integer.parseInt(st.nextToken());

            int[] pageArr = new int[3];

            if (targetPage % 2 == 0) {
                pageArr[0] = targetPage - 1;
                pageArr[1] = totalPage - targetPage + 1;
                pageArr[2] = totalPage - targetPage + 2;
            } else {
                pageArr[0] = targetPage + 1;
                pageArr[1] = totalPage - targetPage;
                pageArr[2] = totalPage - targetPage + 1;
            }

            Arrays.sort(pageArr);

            bw.write( pageArr[0] + " " + pageArr[1] + " " + pageArr[2] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9437().solution();
    }
}

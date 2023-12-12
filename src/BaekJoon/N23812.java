package BaekJoon;

import java.io.*;

//골뱅이 찍기 - 돌아간 ㅍ
public class N23812 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        print(size, result, 'B');
        print(size, result, 'A');
        print(size, result, 'B');
        print(size, result, 'A');
        print(size, result, 'B');

        bw.write(result.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    void print(int size, StringBuilder sb, char type) {
        for (int i = 0; i < size; i++) {
            if (type == 'A') {
                for (int j = 0; j < 5 * size; j++) {
                    sb.append('@');
                }
                sb.append('\n');
            } else {
                for (int j = 0; j < size; j++) {
                    sb.append('@');
                }
                for (int j = 0; j < 3 * size; j++) {
                    sb.append(' ');
                }
                for (int j = 0; j < size; j++) {
                    sb.append('@');
                }
                sb.append('\n');
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new N23812().solution();
    }
}

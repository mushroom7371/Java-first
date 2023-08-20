package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//럭비 클럽
public class N2083 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            String input = br.readLine();
            if (input.equals("# 0 0")) {
                break;
            }

            st = new StringTokenizer(input);
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            if (age > 17 || weight >= 80) {
                bw.write(name + " Senior\n");
            } else {
                bw.write(name + " Junior\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2083().solution();
    }
}

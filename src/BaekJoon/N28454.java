package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Gift Expire Date
public class N28454 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        String nowDateStr = st.nextToken() + st.nextToken() + st.nextToken();
        int nowDate = Integer.parseInt(nowDateStr);
        int testCase = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine(), "-");
            String expireDateStr = st.nextToken() + st.nextToken() + st.nextToken();
            int expireDate = Integer.parseInt(expireDateStr);

            if (nowDate <= expireDate) {
                count++;
            }
        }

        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N28454().solution();
    }
}

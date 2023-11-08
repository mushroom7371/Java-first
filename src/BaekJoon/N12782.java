package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//비트 우정지수
public class N12782 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0) {
            StringTokenizer st=  new StringTokenizer(br.readLine());
            String firstBinary = st.nextToken();
            String secondBinary = st.nextToken();

            int zeroCount = 0;
            int oneCount = 0;
            for (int i = 0; i < firstBinary.length(); i++) {
                if (firstBinary.charAt(i) != secondBinary.charAt(i)) {
                    if (firstBinary.charAt(i) == '0') {
                        zeroCount++;
                    } else {
                        oneCount++;
                    }
                }
            }

            if (zeroCount > oneCount) {
                bw.write(zeroCount + "\n");
            } else {
                bw.write(oneCount + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N12782().solution();
    }
}

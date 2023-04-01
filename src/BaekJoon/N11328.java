package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//Strfry
public class N11328 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase --> 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String origin = st.nextToken();
            String target = st.nextToken();

            int [] countArray = new int[26];

            for (int i = 0; i < origin.length(); i++) {
                int originIndex = origin.charAt(i) - 'a';

                countArray[originIndex]++;
            }

            for (int i = 0; i < target.length(); i++) {
                int targetIndex = target.charAt(i) - 'a';

                countArray[targetIndex]--;
            }

            boolean isPossible = true;
            for (int i = 0; i < countArray.length; i++) {
                if (countArray[i] != 0) {
                    isPossible = false;
                    break;
                }
            }

            if (isPossible) {
                bw.write("Possible\n");
            } else {
                bw.write("Impossible\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N11328().solution();
    }
}

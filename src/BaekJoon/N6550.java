package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//부분 문자열
public class N6550 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String input = "";

        while ((input = br.readLine()) != null && !input.isEmpty()){
            st = new StringTokenizer(input);
            String inputS = st.nextToken();
            String inputT = st.nextToken();
            StringBuilder sb = new StringBuilder();

            int index = 0;

            for (int i = 0; i < inputS.length(); i++) {

                for (int j = index; j < inputT.length(); j++) {
                    if (inputS.charAt(i) == inputT.charAt(j)) {
                        sb.append(inputT.charAt(j));
                        index = j+1;
                        break;
                    }
                }

            }

            if (inputS.equals(String.valueOf(sb))) {
                bw.write("Yes\n");
            } else {
                bw.write("No\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N6550().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//문자열 압축 해제
public class N23746 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, String> patternMap = new HashMap<>();
        int numberOfPattern = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < numberOfPattern; i++) {
            st = new StringTokenizer(br.readLine());
            String lowerCase = st.nextToken();
            String upperCase = st.nextToken();

            patternMap.put(upperCase, lowerCase);
        }

        String pressString = br.readLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i< pressString.length(); i++) {
            result.append(patternMap.get(String.valueOf(pressString.charAt(i))));
        }

        st = new StringTokenizer(br.readLine());
        int startIndex = Integer.parseInt(st.nextToken()) - 1;
        int endIndex = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(result.substring(startIndex, endIndex)));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N23746().solution();
    }
}

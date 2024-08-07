package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//강당 대관
public class N31994 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> seminarInfo = new HashMap<>();

        int max = 0;
        for (int i = 0; i < 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String seminarName = st.nextToken();
            int numberOfPeople = Integer.parseInt(st.nextToken());

            seminarInfo.put(seminarName, numberOfPeople);
            max = Math.max(max, numberOfPeople);
        }

        for (String seminarName : seminarInfo.keySet()) {
            int numberOfPeople = seminarInfo.get(seminarName);
            if (numberOfPeople == max) {
                bw.write(seminarName);
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N31994().solution();
    }
}

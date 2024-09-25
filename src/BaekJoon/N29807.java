package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//학번을 찾아줘!
public class N29807 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] subjects = {"kor", "math", "eng", "tam", "other"};
        int numberOfSubjects = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<String, Integer> scores = new HashMap<>(Map.of(
                "kor", 0,
                "math", 0,
                "eng", 0,
                "tam", 0,
                "other", 0
        ));
        for (int i = 0; i < numberOfSubjects; i++) {
            scores.put(subjects[i], Integer.parseInt(st.nextToken()));
        }

        long result = 0;
        if (scores.get("kor") > scores.get("eng")) {
            result += (scores.get("kor") - scores.get("eng")) * 508L;
        } else {
            result += (scores.get("eng") - scores.get("kor")) * 108L;
        }

        if (scores.get("math") > scores.get("tam")) {
            result += (scores.get("math") - scores.get("tam")) * 212L;
        } else {
            result += (scores.get("tam") - scores.get("math")) * 305L;
        }

        if (scores.get("other") > 0) {
            result += scores.get("other") * 707L;
        }

        result *= 4763;
        bw.write(result + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N29807().solution();
    }
}

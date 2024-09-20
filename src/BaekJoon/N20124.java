package BaekJoon;

import java.io.*;
import java.util.*;

//모르고리즘 회장님 추천 받습니다
public class N20124 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> peopleInfo = new HashMap<>();
        int numberOfPeople = Integer.parseInt(br.readLine());
        int max = 0;

        while (numberOfPeople --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            peopleInfo.put(name, score);
            if (max < score) {
                max = score;
            }
        }

        List<String> people = new ArrayList<>();
        for (String name : peopleInfo.keySet()) {
            if (peopleInfo.get(name) == max) {
                people.add(name);
            }
        }

        Collections.sort(people);
        bw.write(people.get(0));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N20124().solution();
    }
}

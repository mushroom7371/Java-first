package BaekJoon;

import java.io.*;
import java.util.*;

//붙임성 좋은 총총이
public class N26069 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfRecord = Integer.parseInt(br.readLine());
        Set<String> peopleSet = new HashSet<>();
        peopleSet.add("ChongChong");;

        for (int i = 0; i < numberOfRecord; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String firstPerson = st.nextToken();
            String secondPerson = st.nextToken();

            if (peopleSet.contains(firstPerson) || peopleSet.contains(secondPerson)) {
                peopleSet.add(firstPerson);
                peopleSet.add(secondPerson);
            }
        }

        bw.write(peopleSet.size() + "");

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N26069().solution();
    }
}

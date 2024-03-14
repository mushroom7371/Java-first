package BaekJoon;

import java.io.*;
import java.util.*;

//모르고리즘 회장 정하기
public class N30684 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfPeople = Integer.parseInt(br.readLine());
        List<String> nameList = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String name = br.readLine();
            if (name.length() == 3) {
                nameList.add(name);
            }
        }

        Collections.sort(nameList);
        bw.write(nameList.get(0));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N30684().solution();
    }
}

package BaekJoon;

import java.io.*;
import java.util.*;

//줄 세우기
public class N2605 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfStudent = Integer.parseInt(br.readLine());
        List<Integer> studentList = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= numberOfStudent; i++) {
            int studentIndex = Integer.parseInt(st.nextToken());

            studentList.add(studentList.size() - studentIndex, i);
        }

        for (int i = 0; i < studentList.size(); i++) {
            bw.write(studentList.get(i) + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2605().solution();
    }
}

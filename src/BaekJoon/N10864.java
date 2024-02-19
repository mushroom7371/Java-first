package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//친구
public class N10864 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfPeople = Integer.parseInt(st.nextToken());
        int numberOfRelations = Integer.parseInt(st.nextToken());
        int[] people = new int[numberOfPeople];

        for (int i = 0; i < numberOfRelations; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            people[a - 1]++;
            people[b - 1]++;
        }

        for (int i = 0; i < numberOfPeople; i++) {
            bw.write(people[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10864().solution();
    }
}

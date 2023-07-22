package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//사나운 개
public class N2991 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int barkTimeOfDogA = Integer.parseInt(st.nextToken());
        int restTimeOfDogA = Integer.parseInt(st.nextToken());
        int totalTimeOfDogA = barkTimeOfDogA + restTimeOfDogA;
        int[] attackInfoOfDogA = new int[totalTimeOfDogA];
        int barkTimeOfDogB = Integer.parseInt(st.nextToken());
        int restTimeOfDogB = Integer.parseInt(st.nextToken());
        int totalTimeOfDogB = barkTimeOfDogB + restTimeOfDogB;
        int[] attackInfoOfDogB = new int[totalTimeOfDogB];

        for (int i = 0; i < barkTimeOfDogA; i++) {
            attackInfoOfDogA[i] = 1;
        }

        for (int i = 0; i < barkTimeOfDogB; i++) {
            attackInfoOfDogB[i] = 1;
        }
        
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int arrivedPeopleTime = Integer.parseInt(st.nextToken());
            int numberOfAttacks = 0;

            numberOfAttacks += attackInfoOfDogA[(arrivedPeopleTime - 1) % totalTimeOfDogA];
            numberOfAttacks += attackInfoOfDogB[(arrivedPeopleTime - 1) % totalTimeOfDogB];

            bw.write(numberOfAttacks + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N2991().solution();
    }
}

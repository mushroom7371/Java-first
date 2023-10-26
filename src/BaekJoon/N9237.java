package BaekJoon;

import java.io.*;
import java.util.*;

//이장님 초대
public class N9237 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int numberOfTree = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] treeArray = new Integer[numberOfTree];

        for (int i = 0; i < numberOfTree; i++) {
            treeArray[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(treeArray, Collections.reverseOrder());
        for (int i = 0; i < numberOfTree; i++) {
            treeArray[i] = i+1+treeArray[i];
        }

        Arrays.sort(treeArray, Collections.reverseOrder());
        bw.write(String.valueOf(treeArray[0]+1));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N9237().solution();
    }
}

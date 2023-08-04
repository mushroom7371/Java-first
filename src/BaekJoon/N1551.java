package BaekJoon;

import java.io.*;
import java.util.*;

//수열의 변화
public class N1551 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sizeOfArray = Integer.parseInt(st.nextToken());
        int numberOfIterations = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ",");
        List<Integer> numberArray = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++) {
            numberArray.add(Integer.parseInt(st.nextToken()));
        }

        while (numberOfIterations --> 0) {
            List<Integer> tempArray = new ArrayList<>();
            for (int i = 0; i < numberArray.size()-1; i++) {
                tempArray.add(numberArray.get(i+1) - numberArray.get(i));
            }
            numberArray = tempArray;
        }

        for (int i = 0; i < numberArray.size(); i++) {
            if (i == numberArray.size() -1) {
                bw.write(numberArray.get(i) + "");
            } else {
                bw.write(numberArray.get(i) + ",");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1551().solution();
    }
}

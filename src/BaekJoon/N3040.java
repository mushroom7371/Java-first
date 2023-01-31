package BaekJoon;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

//백설 공주와 일곱 난쟁이
public class N3040 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> hobbitList = new LinkedList<>();
        int numberOfHobbit = 9;
        int hatSizeSum = 0;
        int criminalHobbit1 = 0;
        int criminalHobbit2 = 0;
        boolean findFlag = false;

        for (int i = 0; i < numberOfHobbit; i++) {
            int hatSize = Integer.parseInt(br.readLine());
            hobbitList.add(hatSize);
            hatSizeSum += hatSize;
        }

        for (int i = 0; i < numberOfHobbit-1; i++) {
            for(int j = i+1; j < numberOfHobbit; j++) {
                if (hatSizeSum - hobbitList.get(i) - hobbitList.get(j) == 100) {
                    criminalHobbit1 = i;
                    criminalHobbit2 = j;
                    findFlag = true;
                    break;
                }
            }
            if (findFlag) {
                break;
            }
        }

        for (int i = 0; i < hobbitList.size(); i++) {
            if (i == criminalHobbit1) {
            } else if (i == criminalHobbit2) {
            } else {
                bw.write(hobbitList.get(i) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N3040().solution();
    }
}

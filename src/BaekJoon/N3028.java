package BaekJoon;

import java.io.*;

//창영마을
public class N3028 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] methodArray = br.readLine().split("");
        int[] cupArray = {1, 0, 0};

        for (int i = 0; i < methodArray.length; i++) {
            cupArray = swap(cupArray, methodArray[i]);
        }

        for (int i = 0; i < cupArray.length; i++) {
            if (cupArray[i] == 1) {
                bw.write(i + 1 + "");
                break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    int [] swap(int [] array, String method) {
        int index = 0;
        int targetIndex = 0;

        switch (method) {
            case "A":
                index = 0;
                targetIndex = 1;
                break;
            case "B":
                index = 1;
                targetIndex = 2;
                break;
            case "C":
                index = 0;
                targetIndex = 2;
                break;
        }

        int temp = array[index];
        array[index] = array[targetIndex];
        array[targetIndex] = temp;

        return array;
    }

    public static void main(String[] args) throws IOException {
        new N3028().solution();
    }
}

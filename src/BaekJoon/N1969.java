package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//DNA
public class N1969 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberOfDNA = Integer.parseInt(st.nextToken());
        int lengthOfDNA = Integer.parseInt(st.nextToken());
        String[] arrayOfDNA = new String[numberOfDNA];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numberOfDNA; i++) {
            arrayOfDNA[i] = br.readLine();
        }

        for (int i = 0; i < lengthOfDNA; i++) {
            int[] countOfDNA = new int[4];

            for (int j = 0; j <numberOfDNA; j++) {
                switch (arrayOfDNA[j].charAt(i)) {
                    case 'A':
                        countOfDNA[0]++;
                        break;
                    case 'C':
                        countOfDNA[1]++;
                        break;
                    case 'G':
                        countOfDNA[2]++;
                        break;
                    case 'T':
                        countOfDNA[3]++;
                        break;
                }
            }

            int max = 0;
            for (int j = 0; j < countOfDNA.length; j++) {
                if (countOfDNA[j] > max) {
                    max = countOfDNA[j];
                }
            }

            for (int j = 0; j < countOfDNA.length; j++) {
                if (countOfDNA[j] == max) {
                    switch (j) {
                        case 0:
                            result.append("A");
                            break;
                        case 1:
                            result.append("C");
                            break;
                        case 2:
                            result.append("G");
                            break;
                        case 3:
                            result.append("T");
                            break;
                    }
                    break;
                }
            }
        }

        int hammingDistance = 0;
        for (int i = 0; i < numberOfDNA; i++) {
            for (int j = 0; j < lengthOfDNA; j++) {
                if (arrayOfDNA[i].charAt(j) != result.charAt(j)) {
                    hammingDistance++;
                }
            }
        }

        bw.write(result + "\n" + hammingDistance);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N1969().solution();
    }
}

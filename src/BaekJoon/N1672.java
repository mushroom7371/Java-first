package BaekJoon;

import java.io.*;

//DNA 해독
public class N1672 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int dnaLength = Integer.parseInt(br.readLine());
        StringBuilder dna = new StringBuilder(br.readLine());
        char[][] dnaArray = {
            {'A', 'C', 'A', 'G'},
            {'C', 'G', 'T', 'A'},
            {'A', 'T', 'C', 'G'},
            {'G', 'A', 'G', 'T'}
        };

        for (int i = 0; i < dnaLength - 1; i++) {
            char lastDna = dna.charAt(dna.length() - 1);
            char secondLastDna = dna.charAt(dna.length() - 2);

            int row = getIndex(lastDna);
            int col = getIndex(secondLastDna);

            dna.deleteCharAt(dna.length() - 1);
            dna.deleteCharAt(dna.length() - 1);
            dna.append(dnaArray[row][col]);
        }

        bw.write(dna.toString());

        br.close();
        bw.flush();
        bw.close();
    }

    int getIndex(char dna) {
        switch (dna) {
            case 'A':
                return 0;
            case 'G':
                return 1;
            case 'C':
                return 2;
            case 'T':
                return 3;
            default:
                return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        new N1672().solution();
    }
}

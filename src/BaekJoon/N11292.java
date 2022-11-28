package BaekJoon;

import java.io.*;

//키 큰 사람
public class N11292 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase;

        while((testCase = Integer.parseInt(br.readLine())) != 0){
            String[][] peopleInfo = new String[testCase][2];

            for(int i = 0; i < testCase; i++){
                peopleInfo[i] = br.readLine().split(" ");
            }

            Double max = Double.parseDouble(peopleInfo[0][1]);

            for(int i = 0; i < testCase -1; i++){
                Double tempA = Double.parseDouble(peopleInfo[i][1]);
                Double tempB = Double.parseDouble(peopleInfo[i+1][1]);

                if(Double.compare(tempA, tempB) >= 0){
                    max = tempA;
                }else{
                    max = tempB;
                }
            }

            for(int i = 0; i < testCase; i++){
                Double temp = Double.parseDouble(peopleInfo[i][1]);

                if(Double.compare(max, temp) == 0){
                    bw.write(peopleInfo[i][0] + " ");
                }
            }

            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        new N11292().solution();
    }
}

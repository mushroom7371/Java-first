package BaekJoon;

import java.io.*;

//N과 M(1)
public class N15649 {
    //바로 전 커밋 내용과 비슷한 방식. 기연을 얻어 수정했다(by Nahwasa)
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int [] numberArray;
    boolean [] isVisitArray;

    public void dfs(int N, int M, int depth) throws IOException {
        if(depth == M){
            for(int i = 0; i <  numberArray.length; i++){
                bw.write(numberArray[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for(int i = 0; i < N; i++){
            if(!isVisitArray[i]){
                isVisitArray[i] = true;
                numberArray[depth] = i + 1;
                dfs(N, M, depth + 1);
                isVisitArray[i] = false;
            }
        }
    }

    public void solution() throws IOException{
        String [] numberInfo = br.readLine().split(" ");
        int numberN = Integer.parseInt(numberInfo[0]);
        int numberM = Integer.parseInt(numberInfo[1]);
        isVisitArray = new boolean[numberN];
        numberArray = new int[numberM];

        dfs(numberN, numberM, 0);

        br.close();
        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws IOException {
        new N15649().solution();
    }
}
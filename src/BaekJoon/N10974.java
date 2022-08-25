package BaekJoon;

import java.io.*;

//모든 순열
public class N10974 {
    //DFS를 통해서 풀었다. 해당 내용에 대한 설명은 N15649번 N과 M(1) 문제와 같음
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

    void solution() throws IOException{
        int numberN = Integer.parseInt(br.readLine());
        int numberM = numberN;

        isVisitArray = new boolean[numberN];
        numberArray = new int[numberM];

        dfs(numberN, numberM, 0);

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        new N10974().solution();
    }
}

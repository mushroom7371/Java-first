package BaekJoon;

import java.io.*;

//N과 M(1)
public class N15649 {
    //static으로 선언하지 않고 클래스로 빼서 쓴 코드 로직 설명은 이전 히스토리 참고
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] numberInfo = br.readLine().split(" ");
        int numberN = Integer.parseInt(numberInfo[0]);
        int numberM = Integer.parseInt(numberInfo[1]);

        dfsClass dc = new dfsClass(numberN, numberM);

        dc.dfs(numberN, numberM, 0);

        br.close();
        dc.bw.flush();
        dc.bw.close();

    }
}

class dfsClass{
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    boolean [] isVisitArray;
    int [] numberArray;

    dfsClass(int N, int M){
        this.isVisitArray = new boolean[N];
        this.numberArray = new int[M];
    }

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
}

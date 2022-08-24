package BaekJoon;

import java.io.*;
import java.util.*;

//N과 M(2)
public class N15650 {
    //String의 특징을 사용하여 중복을 제거 하는 방식으로 풀이는 성공했으나 메모리, 시간 면에서 모든게 안좋은 코드. 다시 풀 예정
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int [] numberArray;
    boolean [] isVisitArray;
    Set<String> setForDeduplication;

    public void dfs(int N, int M, int depth) throws IOException {
        String temp = "";
        List<Integer> tempList = new ArrayList<>();

        if(depth == M){
            for(int i = 0; i < numberArray.length; i++){    //ArrayList에 담고
                tempList.add(numberArray[i]);
            }

            Collections.sort(tempList); //정렬

            for(int i = 0; i < tempList.size(); i++){   //데이터들을 String에 저장 후
                if(i == tempList.size() - 1){
                    temp += tempList.get(i);
                }else{
                    temp += tempList.get(i) + " ";
                }
            }

            setForDeduplication.add(temp);  //TreeSet에 저장

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
        setForDeduplication = new TreeSet<>();  //중복 제거를 위해 선언

        dfs(numberN, numberM, 0);

        Iterator forPrint = setForDeduplication.iterator(); //출력을 위해선언

        while(forPrint.hasNext()){  //버퍼에 기록
            bw.write(forPrint.next() + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
    public static void main(String[] args) throws IOException {
        new N15650().solution();
    }
}

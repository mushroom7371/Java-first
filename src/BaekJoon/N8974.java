package BaekJoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//희주의 수학시험
public class N8974 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());   //시작 위치
        int end = Integer.parseInt(st.nextToken()); //끝 위치
        List<Integer> numberList = new ArrayList<>();   //수열이 담길 ArrayList
        int sum = 0;    //합이 담길 변수

        for(int i = 1; i <= 45; i++){   //주어질 마지막 위치의 최대값이 1000이므로 가우스 정리를 통해 구한 최대 인덱스에 해당하는 45까지 반복 설정
            for(int j = 1; j <= i; j++){    //반복을 1부터 i까지로 설정해서 같은 숫자가 i번 나오도록 설정
                numberList.add(i);
            }
        }

        for(int i = start - 1; i < end; i++){   //ArrayList의 인덱스는 0부터 시작이므로 시작위치 -1에서 end 전까지 반복
            sum += numberList.get(i);   //합을 구해준다.
        }

        bw.write(sum + "");

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N8974().solution();
    }
}

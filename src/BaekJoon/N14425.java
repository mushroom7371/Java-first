package BaekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

//문자열 집합
public class N14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] numberStr = br.readLine().split(" ");
        int N = Integer.parseInt(numberStr[0]); //집합 s의 개수
        int M = Integer.parseInt(numberStr[1]); //검사해야 되는 문자열의 개수
        Set<String> stringSetS = new HashSet<String>();   //집합 s의 문자열을 저장할 HashSet
        String [] stringArrayForCompare = new String[M];   //검사해야될 문자열이 담길 배열
        int count = 0;  //카운트 변수

        for(int i = 0; i < N; i++){ //hashSet에 문자열을 입력받아 저장
            stringSetS.add(br.readLine());
        }

        for(int i = 0; i < M; i++){ //Sting 배열에 문자열을 입력받아 저장
            stringArrayForCompare[i] = br.readLine();
            if(stringSetS.contains(stringArrayForCompare[i])){  //hashSet에 저장된 문자열 중 비교할 문자열이 담긴 배열의 데이터가 포함된다면
                count++;
            }
        }

        br.close();
        bw.write(count + "");
        bw.flush();
        bw.close();

    }
}

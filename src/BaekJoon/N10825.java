package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

//국영수
public class N10825 {
    //정렬 문제로 주어지는 조건대로 코드를 작성함

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        String[][] studentInfo = new String[testCase][4];

        for(int i = 0; i < testCase; i++){
            studentInfo[i] = br.readLine().split(" ");  //1차원 배열이 가리키는 곳엔 이름/국/영/수 정보가 담긴 배열이 있다
        }

        Arrays.sort(studentInfo, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(Integer.parseInt(o1[1]) == Integer.parseInt(o2[1])){ //국어 점수가 같을때
                    if(Integer.parseInt(o1[2]) == Integer.parseInt(o2[2])){ //국어,영어 점수가 같을때
                        if(Integer.parseInt(o1[3]) == Integer.parseInt(o2[3])){ //국어,영어,수학 점수가 같을때
                            return o1[0].compareTo(o2[0]);  //이름이 사전순으로 증가하는 순서
                        }
                        return Integer.compare(Integer.parseInt(o2[3]), Integer.parseInt(o1[3]));   //수학 점수가 감소하는 순서
                    }
                    return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));   //영어 점수가 증가하는 순서
                }

                return Integer.compare(Integer.parseInt(o2[1]), Integer.parseInt(o1[1]));   //점수가 서로 다를 때는 국어점수가 감소하는 순서
            }
        });

        for(int i = 0; i < studentInfo.length; i++){
            bw.write(studentInfo[i][0] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N10825().solution();
    }
}

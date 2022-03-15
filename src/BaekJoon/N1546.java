package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//평균
public class N1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());  //점수를 담을 배열의 크기를 받음
        Double [] scoreArr = new Double[num];       //주어진 점수를 가공할 예정이므로 double 타입의 데이터를 담을 배열 선언
        double sum = 0;
        st = new StringTokenizer(br.readLine());
        //buffer 내용은 이전 커밋 내용 참고

        for(int i = 0; i < scoreArr.length; i++){   //우선 입력받은 문자열을 공백을 기준으로 분류하여 배열에 담아둔다
            scoreArr[i] = Double.parseDouble(st.nextToken());
        }

        double max = scoreArr[0];   //최대값을 구하기 전 기준을 세움

        for(int i = 0; i < scoreArr.length; i++){   //최대값 구하기
            if(max < scoreArr[i]){
                max = scoreArr[i];
            }
        }

        for(int i = 0; i < scoreArr.length; i++){   //문제에서 주어진 대로 점수를 가공하고 합계로 더해준다.
            scoreArr[i] = (scoreArr[i]/max)*100;
            sum += scoreArr[i];
        }

        System.out.println(sum/num);    //평균을 내서 출력

    }
}

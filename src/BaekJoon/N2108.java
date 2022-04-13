package BaekJoon;

import java.io.*;
import java.util.Arrays;

//통계학
public class N2108 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];    //첫줄로 입력받은 숫자만큼의 크기를 가지는 배열 선언
        double sum = 0; //합이 저장될 변수

        for(int i = 0; i < arr.length; i++){    //입력받을 숫자를 배열의 각각의 번지에 저장
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];  //반복을 시행하며 해당 데이터를 합하여 준다
        }

        br.close();
        int count = 0;
        int max = -1;
        int mod = arr[0];   //최초 최빈값을 저장해 두지 않으면 반복문이 돌지 않기에 설정
        boolean chk = false;    //최빈값 체크에 이용될 변수

        Arrays.sort(arr);   //정렬

        for(int i = 0; i < n - 1; i++){
            if(arr[i] == arr[i + 1]){   //연속되는 번지의 데이터가 같다면
                count++;    //카운트 증가
            }else{  //연속되지 않다면 카운트가 0으로 설정됨(이전 단계에서 정렬을 실시 하였기에 연속 되지 않다면 최빈값의 대상이 되지 않는다)
                count = 0;
            }

            if(max < count){    //max값을 -1로 초기화 하였기에 최초 한번은 이 조건을 거친다
                max = count;    //max의 값을 count로 설정하고
                mod = arr[i];   //최빈값은 반복을 진행중인 데이터로 설정
                chk = true;
            }else if(max == count && chk == true){
                mod = arr[i];
                chk = false;
            }
        }

        bw.write(Math.round(sum/n) + "" + "\n");
        bw.write(arr[(n - 1) / 2] + "" + "\n");
        bw.write(mod + "" + "\n");
        bw.write(arr[n - 1] - arr[0] + "" + "\n");
        bw.flush();
        bw.close();

    }
}

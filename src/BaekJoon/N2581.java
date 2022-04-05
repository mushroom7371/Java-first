package BaekJoon;

import java.io.*;

//소수
public class N2581 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int start = Integer.parseInt(br.readLine());    //시작 숫자
        int end = Integer.parseInt(br.readLine());  //끝 숫자
        br.close();
        int sum = 0;    //합을 저장할 변수
        int min = 0;    //소수 중 제일 작은 값을 저장할 변수

        for(int i = start; i <= end; i++){  //주어진 시작과 끝 숫자를 반복 범위로 설정
            int j = 2;  //소수는 1과 자기 자신만으로 나눠 떨어지는 수로 나눌때 1을 하지 않기 위해 설정
            for(j = 2; j < i; j++){ //2부터 소수를 판별할 숫자 i 전 까지 나눠준다.
                if(i % j == 0){ //나눴을때 0이 있다는 것은 소수가 아니므로
                    break;  //반복을 마침
                }
            }
            if(j == i){
                //위에서 break문을 만나면 j = i가 될 수 없으며 조건문을 무시하고 진행함. 하지만 break문을 만나지 않고 내려와 j = i가 된다면 소수이다
                if(min == 0){   //최초 한번만 소수중에서 최소 숫자를 변수에 담기위해 조건문을 걸었다
                    min = j;
                }
                sum += i;
            }
        }

        if(min == 0){
            bw.write(-1 + "");  //소수가 없으면 -1을
        }else{
            bw.write(sum + "" + "\n" + min + "");   //있다면 소수의 합과 그 소수중 최소값을 버퍼에 기록
        }

        bw.flush();
        bw.close();

    }
}

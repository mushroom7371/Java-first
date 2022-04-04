package BaekJoon;

import java.io.*;

//피보나치 수 5
public class N10870 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = Integer.parseInt(br.readLine());   //키보드로 부터 입력 받을 수
        br.close();
        bw.write(fibo(number) + "");    //아래에 선언한 피보나치 수를 구하는 함수 호출 후 버퍼에 기록
        bw.flush();
        bw.close();
    }

    public static int fibo(int number){ //static 으로 메서드를 정의하여 객체 생성없이 사용가능
        if(number == 0){    //인자값이 0이면 0을 반환
            return 0;
        }else if(number == 1){  //인자 값이 1이면 1을 반환
            return 1;
        }

        //위의 조건에 부합하지 않으면 계속적으로 자기 자신을 호출하여 값을 반환한다.
        return fibo(number - 1) + fibo(number - 2);

    }

}

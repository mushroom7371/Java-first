package BaekJoon;

import java.io.*;

//소수찾기
public class N1978 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());  //숫자의 갯수
        String str = br.readLine(); //입력된 숫자들

        br.close();
        String [] strArr = str.split(" ");  //공백을 기준으로 나눠 각각의 숫자를 String 타입의 배열에 저장
        int count = 0;  //소수의 갯수가 담길 변수

        for(int i = 0; i < len; i++){   //숫자의 갯수만큼
            if(isPrime(Integer.parseInt(strArr[i]))){   //소수 판별 메서드를 호출하여 해당 숫자가 소수면
                count++;    //카운트 증가
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();

    }

    public static boolean isPrime(int num){ //static으로 선언하여 클래스가 메모리에 올라갈때 생성, 바로 사용 가능
        if(num == 1){   //1은 소수가 아니다
            return false;
        }

        for(int i = 2; i < num; i++){   //2부터 인자로 받은 숫자 전까지
            if(num % i == 0){   //인자값을 나눴을때 나머지가 0이면 소수가 아니다
                return false;
            }
        }

        return true;    //위의 판별에서 return문을 만나지 않았다면 소수가 맞다
    }
}

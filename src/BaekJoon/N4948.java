package BaekJoon;

import java.io.*;

//베르트랑 공준
public class N4948 {

    public static boolean [] primeArr = new boolean[246913];
    //주어진 숫자가 123456 보다 작으므로, 최대 246912며 배열은 0번지 부터 시작이라 +1을 해서 번지와 숫자를 맞춤

    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = 0;    //주어진 숫자를 담을 변수

        getPrime(); //해당 숫자가 소수임을 판단하여 배열에 담아 둔다

        while(true){
            num = Integer.parseInt(br.readLine());  //키보드로 부터 숫자를 입력 받고

            if(num == 0){   //0을 입력 받으면 반복을 중지
                break;
            }

            int count = 0;  //소수 갯수를 담을 변수

            for(int i = num + 1; i <= 2*num; i++){  //num 보다 큰 수에서 num * 2까지 반복
                if(!primeArr[i]){   //해당 번지의 숫자가 거짓이라면 소수이므로 카운트
                    count++;
                }
            }

            bw.write(count + "" + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static void getPrime(){
        primeArr[0] = true; //0번지 제외
        primeArr[1] = true; //1은 소수에서 제외

        for(int i = 2; i <= Math.sqrt(primeArr.length); i++){   //2부터 primeArr의 길이의 제곱근까지 검사
            if(primeArr[i]){
                continue;
            }

            for(int j = i*i; j < primeArr.length; j += i){  //i제곱 부터 검사 제곱한 수는 소수가 될 수 없음
                primeArr[j] = true;
            }
        }
    }

}

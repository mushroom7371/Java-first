package BaekJoon;

import java.io.*;

//골드바흐의 추측
public class N9020 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());    //주어진 숫자 개수
        int n = 0;

        for(int i = 0; i < T; i++){
            n = Integer.parseInt(br.readLine());    //판별할 숫자

            for(int j = n/2, k = n/2; j > 0; j--, k++){ //절반을 기준으로 1씩 증,감소하면서 판별
                if(isPrime(j) && isPrime(k)){   //둘다 소수라면
                    if(j + k == n){ //두 숫자의 합이 n이라면
                        bw.write(j + " " + k + "\n");   //버퍼에 기록
                        break;
                    }
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int target){  //소수 판별 메서드
        boolean prime = false;
        int i = 2;  //소수는 2이상으로 나눠야 하므로

        if(target == 2){    //2는 소수
            prime = true;
        }else{
            while(i < target){  //인자로 들어온 값보다 작을때 까지 반복
                if(target % i == 0){    //자기 자신이 아닌 수로 나눠서 0이면 소수가 아니다
                    break;
                }
                i++;    //break문을 만나지 못했다면 최종적으로 i는 tartget과 같아진다
            }
        }

        if(i == target){    //나누는 수가 자기 자신이라면 소수이다.
            prime = true;
        }

        return prime;
    }
}

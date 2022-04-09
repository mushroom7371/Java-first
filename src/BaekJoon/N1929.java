package BaekJoon;

import java.io.*;

//소수 구하기
public class N1929 {

    public static boolean [] prime;

    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] str = br.readLine().split(" ");
        br.close();
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        prime = new boolean[n + 1]; //0번지부터 시작이 아니라 1번지부터 담을 것이라 크기는 +1
        getPrime(); //static으로 선언된 메서드 호출(해당 범위 까지의 소수를 판별)

        for(int i = m; i <= n; i++){
            if(!prime[i]){  //소수라면
                bw.write(i + "" + "\n");    //버퍼에 기록
            }
        }

        bw.flush();
        bw.close();

    }

    //에라토스테네스의 체 알고리즘
    public static void getPrime(){
        //0번지는 없는값, 1번지는 숫자 1에 대응하므로 true로 고정, true는 소수가 아님
        prime[0] = true;
        prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++){
            if(prime[i]){
                continue;
            }

            for(int j = i*i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }

}

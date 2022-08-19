package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

//백대열
public class N14490 {

    void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int number1 = Integer.parseInt(st.nextToken());
        int number2 = Integer.parseInt(st.nextToken());

        int gcd = getGcd(Math.max(number1, number2), Math.min(number1, number2));   //초기 비교를 위해서는 첫번째 인자가 큰수, 두번째 인자가 작은수로 설정되어야 함

        bw.write(number1/gcd + ":" + number2/gcd);
        br.close();
        bw.flush();
        bw.close();

    }

    //최대 공약수를 구하는 메서드 재귀호출을 이용한다.
    int getGcd(int a, int b){
        if(b == 0){
            return a;
        }

        return getGcd(b, a % b);
    }

    public static void main(String[] args) throws IOException{
        //이전 풀이에서는 변수 또는 메서드를 객체 생성 없이 쓰기 위해 static으로 선언하여 편하게 사용 했었으나 static을 안쓰는 방식으로 바꾸었다
        //클래스 내부에 문제 해결에 필요한 메서드들을 선언 해놓고(필요하면 변수도 선언) 메인 메서드 실행시 new를 통한 객체 생성을 하여 호출만 하면 된다.
        new N14490().solution();
    }
}

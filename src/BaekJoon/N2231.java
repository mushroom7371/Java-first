package BaekJoon;

import java.io.*;

//분해합
public class N2231 {
    public static void main(String[] args) throws IOException {
        //buffer 관련 설명은 N15552.java, N10951.java 파일 참고
        //int 타입을 기준으로 %와 /를 이용하여 분해합을 구할 수도 있었으나 ex)while, sum += num%10; num /= 10;
        //String으로 풀어보고 싶었다. 하지만 불필요한 형변환 때문인지, String의 해당 인덱스에 있는 문자를 뽑아내는 반복 때문인지
        //메모리 할당이 많고 시간이 오래 걸림
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int flag = 0;   //생성자의 유무에 따라 0을 출력 할수도, 생성자를 출력할 수도 있으므로 판단용 변수 선언
        br.close();

        for (int i = 1; i <= num; i++) {    //최소 생성자를 구할 예정으로 작은수 부터 반복
            if (num == bunhaeHap(i + "")) { //분해합의 결과가 주어진 숫자와 같다면 생성자이므로
                flag = 1;   //판단 기준을 바꿔주고
                bw.write(i + "");   //i를 버퍼에 기록
                break;  //이후의 생성자는 필요 없으므로 반복 해제
            }
        }

        if (flag == 0) {    //위의 반복에 해당 사항이 없다면(생성자 X)
            bw.write("0");  //디폴트 값으로 0을 기록
        }

        bw.flush();
        bw.close();

    }

    public static int bunhaeHap(String num) {   //static으로 선언하여 클래스가 메모리에 적재될 때 최초 한번 생성됨, 객체 없이 사용가능
        int bunhae = Integer.parseInt(num); //해당 숫자 + 각 자리의 숫자의 합을 구할 예정으로 초기 설정함

        for (int i = 0; i < num.length(); i++) {    //String은 Char가 담긴 배열이므로 문자의 길이만큼 반복
            bunhae += Character.getNumericValue(num.charAt(i)); //해당 인덱스의 문자를 숫자로 계산
        }

        return bunhae;
    }
}

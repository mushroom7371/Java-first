package BaekJoon;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//에라토스테네스의 체
public class N2960 {
    public static void main(String[] args) throws IOException {
        //처음엔 int 배열을 선언하여 주어진 2부터 N까지의 수를 전부 저장하고 while문과 for문에서 체에 걸러진 숫자를 0으로 저장하는 방식으로 하였으나 시간 초과가 떠서 LinkedList로 노선 변경
        //성공 하였으나 코드 리뷰가 절실함... while 안에 조건 및 for문, for문 안에 조건 등으로 지저분하다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] inputNumber = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //N1026 참고 0번지는 N 1번지는 K
        List<Integer> numberList = new LinkedList<>();
        int count = 0;  //K번째 지워지는 수와 비교 하기 위한 변수
        int primeNumber = 0;    //체에 거를 초기 소수
        int targetNumber = 0;   //지워지는 수

        for(int i = 1; i < inputNumber[0]; i++){    //LinkedList에 2부터 N까지의 수를 저장
            numberList.add(i + 1);
        }

        while(count != inputNumber[1]){ //지워지는 K번째 수 전까지 반복
            primeNumber = numberList.get(0);    //아래에서 보면 알겠지만, 소수의 배수들은 모두 지워버릴 예정이라 무조건 0번지가 초기 소수가 됨

            if(numberList.size() == 1){ //사이즈가 1밖에 안남으면 지워지는 마지막 수를 저장 하고 while 종료
                targetNumber = numberList.get(0);
                break;
            }else{
                for(int i = 0; i < numberList.size(); i++){
                    if(numberList.get(i) % primeNumber == 0){   //LinkedList에 저장된 i번지의 수가 소수의 배수라면
                        count++;    //카운트 증가
                        targetNumber = numberList.get(i);   //지워지는 수 저장
                        numberList.remove(i);   //해당 데이터 삭제
                    }

                    if(count == inputNumber[1]){    //for문 중간에 break가 없다면 count가 정확히 K와 일치하는 수를 거를수가 없어 조건을 두었다.
                        break;
                    }
                }
            }

            if(count == inputNumber[1]){    //count와 K번째 지워지는 수와 같다면  while 종료
                break;
            }
        }

        bw.write(targetNumber + "");
        br.close();
        bw.flush();
        bw.close();

    }
}

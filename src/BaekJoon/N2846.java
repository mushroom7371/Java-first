package BaekJoon;

import java.io.*;
import java.util.*;

//오르막길
public class N2846 {

    void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arraySize = Integer.parseInt(br.readLine()) + 1;    //주어진 입력의 마지막 숫자를 핸들링 하기 위해 배열의 길이를 +1 해줌 하단의 for문에서 확인 가능
        int[] roadArray = new int[arraySize];
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> listForMaxLength = new ArrayList<>(); //오르막길의 길이를 저장할 ArrayList

        for(int i = 0; i < arraySize; i++){
            if(i < arraySize -1){
                roadArray[i] = Integer.parseInt(st.nextToken());    //토큰의 개수만큼 배열에 수를 저장
            }else{  //마지막 인덱스는 0으로 고정
                roadArray[i] = 0;
            }
        }

        int sum = 0;    //오르막길의 길이 합을 구할 변수

        for(int i = 0; i < arraySize - 1; i++){ //현재 인덱스와 다음 인덱스를 비교할 예정으로 배열의 길이 -1만큼 반복
            if(roadArray[i] < roadArray[i + 1]){    //다음 인덱스의 숫자가 더 크다면
                sum += roadArray[i + 1] - roadArray[i]; //길이합을 두 숫자의 차이로 저장
            }else{
                listForMaxLength.add(sum);  //오르막이 끝났다면 길이 합을 ArrayList에 저장, 길이 합을 0으로 초기화
                sum = 0;
            }
        }

        Collections.sort(listForMaxLength, Collections.reverseOrder()); //내림차순으로 정렬
        bw.write(listForMaxLength.get(0) + ""); //최대 길이는 0번 인덱스의 데이터가 된다. 오르막이 없으면 애초에 0만 저장되어 있음

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException{
        new N2846().solution();
    }
}

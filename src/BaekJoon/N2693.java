package BaekJoon;

import java.io.*;
import java.util.Arrays;

//N번재 큰 수
public class N2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        int [] numberArray;

        for(int i = 0; i < testCase; i++){
            numberArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            //stream()을 통해 컬렉션, 배열등에 저장된 요소들을 하나씩 참조하며 반복 처리를 한다.
            //readLine()으로 읽어 들인 문자열이 split(" ")을 통해 공백을 기준으로 나뉘어 요소들이 배열로 저장되기 때문에 stream()으로 반복 처리가 되는 것이다.
            //mapToInt()를 통해 각각의 요소들이 IntStream으로 바뀌고, sorted()를 통해 오름차순으로 정령된다.
            //마지막 toArray()로 인해 int 배열에 요소가 순차적으로 저장된다.

            bw.write(numberArray[7] + "\n");    //3번째로 큰수를 구할 예정으로 배열의 크기가 10으로 고정되어있기에 7번지의 데이터를 버퍼에 기록한다.
        }

        br.close();
        bw.flush();
        bw.close();

    }
}

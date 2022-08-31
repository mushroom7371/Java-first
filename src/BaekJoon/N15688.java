package BaekJoon;

import java.io.*;
import java.util.Arrays;

//수 정렬하기 5
public class N15688 {
    //백준에 JAVA11 버전으로 BufferedWriter를 사용하니 시간초과가 뜸. StringBuilder를 사용하니 통과 하긴 했는데
    //둘의 차이점을 찾아보니 둘다 String 객체를 다룰때 writer는 불변 속성으로 접근하여 객체를 새로 만든다 하고
    //builder는 반대로 객체를 새로 생성하지 않고 기존 객체를 핸들링 한다는 차이점이 있다고 한다. 여기에 출력 데이터의 갯수등의 변수도 영향을 주겠지만...
    //JAVA8 버전에서의 writer를 사용시 통과 되는 점과 지인의 자문을 구하여 writer가 더 빠르다는 점을 들어보니 미궁으로 빠졌다.
    void solution()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        int [] numberArray = new int[testCase];

        for(int i = 0; i < testCase; i++){
            numberArray[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numberArray);

        for(int i = 0; i < numberArray.length; i++){
            sb.append(numberArray[i]).append("\n");
        }

        br.close();
        System.out.println(sb);

    }

    public static void main(String[] args) throws IOException{
        new N15688().solution();
    }
}

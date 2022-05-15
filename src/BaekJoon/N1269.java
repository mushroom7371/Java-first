package BaekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//대칭 차집합
public class N1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberOfSymmetricDifference = 0;    //대칭차집합의 개수
        int numberOfSetA = Integer.parseInt(st.nextToken());    //집합A의 개수
        int numberOfSetB = Integer.parseInt(st.nextToken());    //잡합B의 개수
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < numberOfSetA; i++){  //StringTokenizer를 이용한 set에 데이터 추가
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < numberOfSetB; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }

        //HashSet의 경우 객체 저장전 객체의 hashCode() 메서드를 호출해서 해시코드를 얻어 낸 후,
        //저장되어 있는 객체들의 해시 코드와 비교하고 같은 해시 코드가 있다면 equals() 메서드를 통해 두 객체를 비교해서 중복여부를 확인 한다.
        for(int numberSetA : setA){ //setA의 원소들을 변수 numberSetA에 대입하여 반복
            if(!setB.contains(numberSetA)){ //setB에 담긴 데이터가 setA에 담긴 데이터와 다르다면
                numberOfSymmetricDifference++;
            }
        }

        for(int numberSetB : setB){
            if(!setA.contains(numberSetB)){
                numberOfSymmetricDifference++;
            }
        }

        br.close();
        bw.write(numberOfSymmetricDifference + "");
        bw.flush();
        bw.close();

    }
}

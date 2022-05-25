package BaekJoon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//나는야 포켓몬 마스터 이다솜
public class N1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String [] inputArray = br.readLine().split(" ");
        int numberOfPokeMonN = Integer.parseInt(inputArray[0]); //도감에 있는 포켓몬 개수N
        int numberOfPokeMonM = Integer.parseInt(inputArray[1]); //맞춰야 되는 포켓몬 개수N
        Map<String, Integer> pokeMonNameAndNumber = new HashMap<>();    //도감에 있는 포켓몬을 key = 포켓몬 이름, value = 포켓몬 번호로 저장할 hashMap
        Map<Integer, String> pokeMonNumberAndName = new HashMap<>();    //위와 반대, entrySet을 이용할까 했는데 중복 없는 1:1 매칭이라 haspMap을 하나 더 생성
        String [] pokeMonNameOrNumber = new String[numberOfPokeMonM];   //맞출 포켓몬 정보가 담길 배열
        int pokeMonNumber = 0;  //포켓몬 번호로 이름을 찾기 위해 사용할 변수

        for(int i = 1; i <= numberOfPokeMonN; i++){ //도감 번호를 1부터 저장하도록 반복
            String input = br.readLine();
            pokeMonNameAndNumber.put(input, i); //이름, 번호로 저장
            pokeMonNumberAndName.put(i, input); //번호, 이름으로 저장
        }

        for(int i = 0; i < numberOfPokeMonM; i++){
            pokeMonNameOrNumber[i] = br.readLine(); //맞춰야 할 포켓몬의 정보를 i 번지에 저장
            if(pokeMonNameOrNumber[i].charAt(0) >= 'A'){    //정보가 문자로 시작한다면
                bw.write(pokeMonNameAndNumber.get(pokeMonNameOrNumber[i]) + "\n");  //번호를 찾아서 버퍼에 기록
            }else{  //숫자로 시작한다면
                pokeMonNumber = Integer.parseInt(pokeMonNameOrNumber[i]);   //문자열로 받은 숫자를 int로 바꿔서
                bw.write(pokeMonNumberAndName.get(pokeMonNumber) + "\n");   //이름을 찾아서 버퍼에 기록
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}

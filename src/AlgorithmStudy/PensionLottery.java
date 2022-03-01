package AlgorithmStudy;

import java.util.ArrayList;
import java.util.List;

//연금복권 번호 생성기
public class PensionLottery {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            numbers.add((int)(Math.random()*10));
        }

        System.out.println(numbers);
    }
}

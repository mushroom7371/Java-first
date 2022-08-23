package programmers;

import java.util.HashSet;
import java.util.Set;

class Ponkemon {
    private int solution(int[] nums) {
        int answer = 0;

        int selectPonkemon = nums.length / 2;   //고를 수 있는 폰켓몬의 수
        Set<Integer> ponkemonSet = new HashSet<>(); //중복 제거를 위한 HashSet

        for (int i = 0; i < nums.length; i++) { //HashSet에 저장
            ponkemonSet.add(nums[i]);
        }

        if (selectPonkemon > ponkemonSet.size()) {  //고를 수 있는 폰켓몬의 수가 폰켓몬 종류보다 많다면
            answer = ponkemonSet.size();
        } else {    //폰켓몬 종류가 고를수 있는 폰켓몬의 수와 크거나 같다면
            answer = selectPonkemon;
        }

        return answer;
    }
}

//프로그래머스 코딩테스트 입문문제 - 짝수는 싫어요

import java.lang.Math;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(int)Math.ceil(n/2.0)];
        
        for(int i=0, j=1; i<answer.length; i++, j+=2){
            answer[i] = j;
        }
        
        return answer;
    }
}

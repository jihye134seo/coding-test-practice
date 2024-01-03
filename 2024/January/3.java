//프로그래머스 코딩테스트 연습 - 코딩테스트 입문 - 피자 나눠 먹기 (3)

import java.lang.Math;

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
       
        answer = (int)Math.ceil((double)n / slice);
        
        return answer;
    }
}

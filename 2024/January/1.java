//프로그래머스 코딩테스트 연습 - 코딩테스트 입문 - 피자 나눠 먹기 (1)

import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer = (int)Math.ceil(n / 7.0);
        
        return answer;
    }
}

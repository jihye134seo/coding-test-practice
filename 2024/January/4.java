//프로그래머스 코딩테스트 입문 - 세균 증식

import java.lang.Math;

class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        
        answer = (int) (n * Math.pow(2, t));
        
        return answer;
    }
}

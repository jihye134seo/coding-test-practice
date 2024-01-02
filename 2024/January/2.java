//프로그래머스 코딩테스트 연습 - 코딩테스트 입문 - 피자 나눠 먹기 (2)

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        answer = n / GCD(n, 6);
        
        return answer;
    }
    
    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return GCD(num2, num1%num2);
    }
}

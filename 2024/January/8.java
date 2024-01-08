// 프로그래머스 코딩테스트 입문 - 369게임

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orderS = Integer.toString(order);
        
        for (int i=0; i<orderS.length(); i++) {
            int num = orderS.charAt(i)-48;
            if (num != 0 && num % 3 == 0) {
               answer++; 
            }
        }
        
        return answer;
    }
}

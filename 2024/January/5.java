// 프로그래머스 코딩테스트 입문 - 외계행성의 나이

class Solution {
    public String solution(int age) {
        String answer = "";
        
        String strAge = Integer.toString(age);
        
        int a = 'a';
 
        for(int i=0; i<strAge.length(); i++){
            char c = strAge.charAt(i);
            int t = a + Integer.parseInt(c + "");
            answer += (char)t;
            
        }
        return answer;
    }
}

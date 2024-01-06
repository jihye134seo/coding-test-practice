//프로그래머스 코딩테스트 입문 - OX퀴즈

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for int i=0; i<quiz.length; i++) {
            String[] op = quiz[i].split(" ");
            int operand1 = Integer.parseInt(op[0]);
            int operand2 = Integer.parseInt(op[2]);
            int result = Integer.parseInt(op[4]);
            
            String operator = op[1];
            int trueResult = 0;
            
            switch (operator) {
                case "+":
                    trueResult = operand1 + operand2;
                    break;
                case "-":
                    trueResult = operand1 - operand2;
                    break;
            }
            
            if (result == trueResult) {
                answer[i] = "O";
            }
            else {
                answer[i] = "X";
            }     
        }
        
        return answer;
    }
}

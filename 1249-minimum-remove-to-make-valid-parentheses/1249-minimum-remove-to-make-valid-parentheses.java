class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                balance++;
                result.append(ch);
            } 
            else if (ch == ')') {
                if (balance > 0) {
                    balance--;
                    result.append(ch);
                }
            } 
            else {
                result.append(ch);
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = result.length() - 1; i >= 0; i--) {
            char ch = result.charAt(i);
            if (ch == '(' && balance > 0) {
                balance--;
            } 
            else {
                answer.append(ch);
            }
        }
        return answer.reverse().toString();
    }
}
class Solution {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<>();
        // if(s.length() == 1) return false;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                a.push(c);
            } else {
                if(a.isEmpty()) return false;
                char uppar = a.peek();
                if(uppar == '('){
                    if(c == ')') a.pop();
                    else return false;
                } 
                else if(uppar == '{' ){
                    if(c == '}') a.pop();
                    else return false;
                }
                else if(uppar == '['){
                    if(c == ']') a.pop();
                    else return false;
                } 
            }
        }
        return a.isEmpty();
    }
}
class Solution {
    public boolean isValid(String s) {
        Stack<Character> str = new Stack<>();
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                str.push(ch);
            }
            else{
                if(str.size() == 0) return false;
                if(ch == ')'){
                    if(str.peek() != '(') return false;
                    str.pop();
                }
                else if(ch == '}'){
                    if(str.peek() != '{') return false;
                    str.pop();
                }
                else if(ch == ']'){
                    if(str.peek() != '[') return false;
                    str.pop();
                }
                else return false;
            }
        }
        if(str.size() > 0) return false;
        else return true;
    }
}
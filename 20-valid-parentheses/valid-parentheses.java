import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;
                
                char che = st.pop();
                
                // If it's NOT a matching pair, return false immediately
                if (!((ch == ')' && che == '(') || 
                      (ch == '}' && che == '{') || 
                      (ch == ']' && che == '['))) {
                    return false;
                }
                // If it matches, do nothing and let the loop continue
            }
        }
        
        // Return true only if all brackets were properly closed
        return st.isEmpty();
    }
}
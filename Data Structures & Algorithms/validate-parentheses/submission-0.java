class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> op=new HashMap<>();
        op.put(')', '(');
        op.put(']', '[');
        op.put('}', '{');

        for(char c : s.toCharArray()) {
            if (op.containsKey(c)) {
                if (!st.isEmpty() && st.peek() == op.get(c)) {
                    st.pop();
                } else {
                    return false;
                }
            } else {
                st.push(c);
            }
        }
        return st.isEmpty();   }
}

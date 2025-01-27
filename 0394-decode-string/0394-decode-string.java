class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        String str = "";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c != ']') {
                st.push(c);
            } else {
                String temp = "";
                while (st.peek() != '[') {
                    temp = st.pop() + temp;
                }
                st.pop();
                String numStr = "";
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    numStr = st.pop() + numStr;
                }
                int repeat = Integer.parseInt(numStr);
                StringBuilder repeated = new StringBuilder();
                for (int j = 0; j < repeat; j++) {
                    repeated.append(temp);
                }
                for (char ch : repeated.toString().toCharArray()) {
                    st.push(ch);
                }
            }
        }
        while (!st.isEmpty()) {
            str = st.pop() + str;
        }

        return str;
    }
}

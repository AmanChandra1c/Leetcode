class Solution {

    public boolean matching(char a, char b){
        return(
            (a == '(' && b == ')')||
            (a == '{' && b == '}')||
            (a == '[' && b == ']')
        );
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char i : s.toCharArray()){
            if(i == '(' || i == '{' || i == '[') stack.push(i);
            else {
                if(stack.isEmpty() == true) return false;
                else if(matching(stack.peek(), i) == false) return false;
                else stack.pop();
            }
        }
        return (stack.isEmpty() == true);
  
    }
}
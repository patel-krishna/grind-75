class Solution {
    public boolean isValid(String s) {

        if((s.length() % 2) !=0){
            return false; 
        }

        Stack<Character> stack = new Stack<Character>(); 

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(')');

            }else if(s.charAt(i) == '{'){
                stack.push('}');
                
            }else if(s.charAt(i) == '['){
                stack.push(']');

            }else {
                if (stack.empty() || stack.pop() != s.charAt(i)) {
                        return false; // If stack is empty or top bracket doesn't match
                    }
            }
        }

        return stack.isEmpty(); 

    }
}

/**
* Go trough the string, if it's an opening bracket add a close bracket to the stack.
* if the character you are currently at is not any of the opening brackets. check if first 
* the stack is not empty 
* the top of the stack is the matching closing character you're currently at in the string. 
*/

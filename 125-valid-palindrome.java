class Solution {
    public boolean isPalindrome(String s) {
        
        //using regular expression to remove the uneeded from the string
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<Character>(); 

        if(s.length() % 2 == 0){
            for(int i = 0; i<s.length()/2 ; i++){
                stack.add(s.charAt(i)); 
            }
            for(int j=s.length()/2; j<s.length(); j++){
                if(s.charAt(j) != stack.pop()){
                    return false; 
                }
            }
        }else{
            for(int i = 0; i<s.length()/2 ; i++){
                stack.add(s.charAt(i)); 
            }
            for(int j=(s.length()/2)+1; j<s.length(); j++){
                if(s.charAt(j) != stack.pop()){
                    return false; 
                }
            }
        }

        return stack.isEmpty(); 

    }
}

      //15ms run-tine --> make a new more optimized solution

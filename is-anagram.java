class Solution {
    public boolean isAnagram(String s, String t) {

        // Edge-Case: if the strings arent the same length 
        if(s.length() != t.length()){
            return false; 
        }

        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();

        for(int i = 0; i<s.length(); i++){
            char tempS = s.charAt(i);
            char tempT = t.charAt(i); 

            if(sMap.containsKey(tempS)){
                sMap.replace(tempS, sMap.get(tempS)+1); 
            }else{
                sMap.put(tempS, 1); 
            }

            if(tMap.containsKey(tempT)){
                tMap.replace(tempT, tMap.get(tempT)+1); 
            }else{
                tMap.put(tempT, 1); 
            }
        }

        for (char key: sMap.keySet()){
            if(sMap.get(key) != tMap.get(key)){
                return false; 
            }
        }

        return true; 

    }
}

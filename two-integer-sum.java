class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if(nums.length == 0){
            return new int[] {0,0}; 
        }

        int[] answer = new int[2]; 
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 

        for(int i = 0; i< nums.length; i++){
            int complement = target - nums[i]; 

            if(map.containsKey(complement)){
                answer[0] = map.get(complement);
                answer[1] = i; 
            }else{
                map.put(nums[i], i); 
            }
        }

        return answer;

    }
}

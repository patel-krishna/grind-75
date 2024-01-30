class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] answer = new int[2]; 
        HashMap<Integer, Integer> tracking = new HashMap<Integer, Integer>(); 

        for(int i=0; i<nums.length; i++){

            int complement = target - nums[i]; 
            
            if(tracking.containsKey(complement)){
                answer[0] = i; 
                answer[1] = tracking.get(complement); 
                break; 
            }else{
                tracking.put(nums[i], i); 
            }
        }

        return answer; 

    }
}

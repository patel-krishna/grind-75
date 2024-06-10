class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>(); 
        
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]); 
        }

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(nums.length);

        if(nums.length != set.size()){
            return true; 
        }

        return false; 
    }
}

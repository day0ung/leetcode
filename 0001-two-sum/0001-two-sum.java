class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int keyi = 0;
        int valuei = 0;
        for (int i = 0; i < nums.length; i ++){
            int key = target - nums[i];
            if(map.containsKey(key)){
                keyi = map.get(key);
                valuei = i;
                break;
            }
            map.put(nums[i], i);
        }
        // for(int i = 0; i <  nums.length; i ++){
        //     for(int j = i + 1 ; j < )
        // }
        return new int[] {keyi, valuei};
    }
}
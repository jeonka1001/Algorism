class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        java.util.HashMap<Integer,Integer> get = new java.util.HashMap<>();
        for(int i = 0; i < nums.length ; i ++){
            get.put(nums[i],nums[i]);
        }
        answer = get.size();
        if(answer >= nums.length/2){
            answer = nums.length/2;
        }
        return answer;
    }
}

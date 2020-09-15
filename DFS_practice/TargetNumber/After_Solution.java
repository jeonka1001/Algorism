class Solution {
    public int dfs(int[] numbers, int idx, int sum, int target){
        if(idx == numbers.length){
            if(sum == target){
                return 1;
            }
            else{
                return 0;
            }
        }
        return dfs(numbers,idx+1,(sum + numbers[idx]),target) + dfs(numbers, idx+1,(sum - numbers[idx]),target);
    }

    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers,0,0,target);
        return answer;
    }
}

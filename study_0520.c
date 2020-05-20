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

class Solution {
    public int solution(int n) {
        int answer = 0;
        java.util.ArrayList<Integer> arr = new java.util.ArrayList<>();
        arr.add(0);
        arr.add(1);
        for(int i = 2 ; i <= n ; i++){
            arr.add(i,(arr.get(i-1)+arr.get(i-2))%1234567);
        }
        answer = arr.get(n);
        return answer%1234567;
    }
}

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int len = A.length;
        java.util.Arrays.sort(A);
        java.util.Arrays.sort(B);
        for(int i = 0 ; i <len ; i ++){
            answer +=(A[i]*B[(len - i)-1]);
        }
        return answer;
    }
}

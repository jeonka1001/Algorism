// 기존 코드에서는 operator를 담을 배열을 따로 선언 후 배열 내부 원소를 체크 후 연산을 하는 작업을 했다.
// 그러나 이 코드는 operator를 담을 배열을 선언하지 않고, 즉시 연산을 하여 누적 연산 값을 전달하여 최종적으로 타겟값과 비교한다.
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
        return dfs(numbers,idx+1,(sum + numbers[idx]),target) + dfs(numbers, idx+1,(sum - numbers[idx]),target); // dfs(덧셈 저장); dfs(뺄셈저장); 의 코드를 즉시 수행하며 저장 후 연산하는 코드를 줄였다.
    }

    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers,0,0,target);
        return answer;
    }
}

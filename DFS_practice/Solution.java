class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int flag = 0;
        for( int i = 0; i < n ; i ++){ // 컴퓨터의 개수만큼 반복문을 반복한다.
            flag = dfs(n,computers,i,answer+2,flag);
            if(flag == 1){
                answer++;
                flag = 0;
            }
        }
        return answer;
    }
    public int dfs(int n , int[][] computers, int target,int gNum, int flag){
        for(int i = 0 ; i < n ; i ++){
            if(computers[target][i] == 1){
                computers[target][i] = gNum;
                computers[i][target] = gNum;
                flag = 1; //정점을 최초 방문시 flag 체크
                if( i != target ){ // 자기 자신과 이어진 간선이 아닐 경우 체크
                    dfs(n,computers,i,gNum,flag);
                }
            }
        }
        return flag;
    }
}

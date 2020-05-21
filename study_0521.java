// 재귀함수로 풀었기 때문에 시간 초과가 났다.

class Solution {
    int MOD = 20170805;
    public int goLoad(int m,int n,int[][]cityMap,int x,int y,int direction){
        int answer = 0;
        if(m==x && n ==y){
            return 1; // 도착완료
        }
        if(x > m){
            return 0; // 오른쪽으로 너무감
        }
        if(y > n){
            return 0; // 아래로 너무감
        }
        if(cityMap[x][y]==1){
            return 0; // 차량 통행 불가능
        }
        else if(cityMap[x][y]==2){
            if(direction == 1){
                answer += goLoad(m,n,cityMap,x+1,y,1)%MOD;
            }else{
                answer += goLoad(m,n,cityMap,x,y+1,2)%MOD;
            }
        }
        else{
            answer += goLoad(m,n,cityMap,x+1,y,1)%MOD;
            answer += goLoad(m,n,cityMap,x,y+1,2)%MOD;
        }
        return answer%MOD;
    }
    
    public int solution(int m, int n, int[][] cityMap) {
        int answer = 0;
        int x = 0; // 현 위치
        int y = 0; // 현 위치
        int direction = 1; //현재 이동한 방향 저장 1:우회전 2:아래직진
        
        answer = goLoad(m-1,n-1,cityMap,x,y,direction)%MOD;
        return answer%MOD;
    }
}

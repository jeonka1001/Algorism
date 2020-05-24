// 개선 전 코드 
-- 모든 테스트 케이스는 맞았으나 효율이 좋지 않다.
-- 모든 원소를 순회하여 체크 -> 모든 원소의 크기비교 후 설치 =>> 시간이 너무 많이 소요된다.

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        // n 은 총 아파트의 개수 - n+1 개의 배열을 만든다. arr
        int[] arr = new int[n+1];
        // stations 배열 원소 +-w 는 와이파이 수신이 된다. -- arr에 1체크
        // 이 때 1 체크시 원소-w가 1이상 n 이하 이다.
        int range = (w*2)+1; // 5
        for(int s : stations){
            int right = (s+w>n?n:s+w);
            int left = (s-w<1?1:s-w);
            for(int i = left;i <=right; i++){
                arr[i]=1;
            }
        }
        
        // 원소 값이 0 인 원소는 기지국을 설치해야 하는데...
        // 0인 원소 카운트 후 (w*2)+1 보다 큰경우 작은경우 체크
        int cnt = 0;
        for(int i = 1 ; i < arr.length ; i ++){
            if(arr[i]==0){
                cnt++;
            }
            else{
                if(cnt !=0){
                    if(cnt < range){
                        answer+=1;
                    }
                    else{
                        answer += (cnt/range);
                        if(cnt%range != 0){
                            answer+=1;
                        }
                    }
                }
                cnt=0;
            }
        }
        // 작은 경우 1
        // 클 경우 나머지 체크,
        // 나머지가 0일경우 몫만큼 설치
        // 나머지가 0이 아닐경우 몫+1 설치
        if(cnt !=0){
            if(cnt < range){
                answer+=1;
            }
            else{
                answer += (cnt/range);
                if(cnt%range != 0){
                    answer+=1;
                }
            }
        }
        return answer;
    }
}

// 개선 후 코드

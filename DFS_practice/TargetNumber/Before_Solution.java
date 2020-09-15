class Solution {
    public int numLength;
    public int glbTar;
    public int[] numArr;

    public int calcNum(int[] ops, int num, int idx){
        int cnt = 0;
        ops[idx]=num;
        idx++;
        if(numLength <= idx){
            int totNum = 0;
            for(int i = 0 ; i < numLength ; i++){
                if(ops[i] == 1){
                    totNum += numArr[i];
                }
                else{
                    totNum -= numArr[i];
                }
            }
            int returnNum = (totNum == glbTar ? 1 : 0);
            return returnNum;
        }
        cnt += calcNum(ops,1, idx);
        cnt += calcNum(ops,0, idx);
        return cnt;
    }

    public int solution(int[] numbers, int target) {
        int answer = 0;
        numLength = numbers.length;
        int[] ops = new int[numLength];
        glbTar = target;
        numArr = numbers;
        answer+=calcNum(ops,0,0);
        answer+=calcNum(ops,1,0);
        return answer;
    }
}

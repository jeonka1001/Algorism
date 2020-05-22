class Solution {
    public boolean findArr(char w,java.util.ArrayList<Character> col){
        for(int i = 0; i < col.size();i++){
            if(col.get(i) == w){
                return true;
            }
        }
        return false;
    }
    public String solution(String sentence) {
        String answer = "";
        java.util.ArrayList<Character> sen = new java.util.ArrayList<>();
        java.util.ArrayList<Character> col = new java.util.ArrayList<>();
        boolean flag = false;
        StringBuffer sb = new StringBuffer();
        for(int i =0 ;i < sentence.length();i++){
            char word = sentence.charAt(i);
            if(i!=0 && word<97 && sentence.charAt(i-1)<97&&(!flag)){
                sen.add(' ');
                flag = true;
            }
            if(word >= 97){
                if( i == 0){
                    col.add(word);
                }
                else{
                    if(col.size()==0){
                        col.add(word);
                    }
                    else{
                        if(col.get(col.size()-1)!= word){ // 단어가 바뀌는 시점
                            if(findArr(word,col)){
                                answer = "invalid";
                                return answer;
                            }
                            if(sentence.charAt(i-1) != sentence.charAt(i-+)){
                                answer = "invalid";
                                return answer;
                            }
                            if()
                            if(!flag){
                                sen.add(' ');
                                flag=true;
                            }
                        }
                        col.add(word);
                    }
                }
            }
            else{
                sen.add(word);
            }
        }
        for(char w : sen){
            sb.append(w);
        }
        answer = sb.toString();
        return answer;
    }
}

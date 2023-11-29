class Solution {
    public int lengthOfLastWord(String s) {
        int res=0;
        String e=" ";
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=e.charAt(0)){
                res+=1;
            }
            else{
                break;
            }
        }return res;
    }
}
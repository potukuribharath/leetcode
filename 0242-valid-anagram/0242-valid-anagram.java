class Solution {
    public boolean isAnagram(String s, String t) {
        boolean b=false;
        if(s.length()!=t.length()){
            return false;
        }
        char []arr = s.toCharArray();
        char []arr1 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(arr1[i]);
            if(arr[i]==arr1[i]){
               b=true;
            }else{
                return false;
            }
        }return true;
    }
}
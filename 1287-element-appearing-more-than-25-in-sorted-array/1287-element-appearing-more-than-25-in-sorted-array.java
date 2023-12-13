class Solution {
    public int findSpecialInteger(int[] arr) {
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count+=1;
            }else{
                count=1;
            }
            if(count>arr.length*0.25){
                return arr[i];
            }
        }
        return arr[0];
    }
}
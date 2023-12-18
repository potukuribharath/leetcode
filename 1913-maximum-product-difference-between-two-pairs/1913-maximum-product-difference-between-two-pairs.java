class Solution {
    
    public int maxProductDifference(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        int x=arr[arr.length-1];
        int y=arr[arr.length-2];
        int fi=x*y;
        int a=arr[0];
        int b=arr[1];
        int la=a*b;
        
        return fi-la;
    }
}
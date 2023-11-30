class Solution {
    public int climbStairs(int n) {
              
            int num1=0;
            int sum=0;
            int num2=1;
            for(int i=1;i<=n;i++){
            if(n==1 || n==0){
                return 1;
            }
            
            sum=num1+num2;
            num1=num2;
            num2=sum;
        }
        
        return sum;
        
    }
}
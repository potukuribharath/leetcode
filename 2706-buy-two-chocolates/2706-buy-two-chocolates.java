class Solution {
    public int buyChoco(int[] prices, int money) {
        int a;
        int b;
        Arrays.sort(prices);
        a=prices[0];
        for(int i=1;i<prices.length;i++){
            b=prices[i];
            
            if((b+a)-money==0){
                return 0;
            }
            if(money-(b+a)<0){
                return money;
            }
            return money-(b+a);
        }return money;
    }
}
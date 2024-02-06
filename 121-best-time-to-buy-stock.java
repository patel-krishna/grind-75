class Solution {
    public int maxProfit(int[] prices) {

        int answer = 0; 

        // for(int i=prices.length-1; i>=0; i--){
        //     for(int j=i-1; j>=0; j--){

        //         int difference = prices[i] - prices[j];

        //         if(difference>answer){
        //             answer = difference; 
        //         }

        //     }
        // }

        //keep track of the lowest number 
        int min = prices[0]; 
        
        for(int i=1; i<prices.length; i++){
           //if you find a new minimum, update it
            if(prices[i]<min){
                min = prices[i]; 
            }

            //calculate difference
            int diff = prices[i] - min; 
            
            //if the profit is higher then update
            if(diff>answer){
                answer = diff; 
            } 
        }

        return answer; 
        
    }
}

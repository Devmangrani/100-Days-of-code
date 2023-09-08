public class Day96 {
        // Question 1672. Richest Customer Wealth
        public static int Richest(int accounts[][]) {
            int wealth = Integer.MIN_VALUE; //-infinity
            for(int row = 0; row<accounts.length;row++){
                //Take sum of rows elements
                int sum = 0;
                for (int col = 0; col < accounts[row].length; col++) {
                    sum += accounts[row][col];
                    //now we have some of cols of row
                    //now we check with other rows
                    if(sum>wealth){
                        wealth=sum;                        
                    }
                }              
            }
            return wealth;
        }
        public static void main(String[] args) {
            int accounts[][] = {{1,2,3},{3,2,1}};
            System.out.println(Richest(accounts));
        }
    }
    


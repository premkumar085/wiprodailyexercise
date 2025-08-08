package com.wipro.basic;

public class arry3 {
    public static void main(String[] args) {
      
    	/*int[] arr = {2, 7, 11, 15};  // the array
        int target = 9;             // the target sum

        // loop through each pair of elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // check if the sum of this pair equals the target
                if (arr[i] + arr[j] == target) {
                    // print the indices of the pair
                    System.out.println("Pair found at indices: [" + i + ", " + j + "]");
                    // also print the values of the pair
                    System.out.println("Values are: [" + arr[i] + ", " + arr[j] + "]");
                    return; // exit after finding the first pair
                }
            }
        }
        */
        
    	int[] arr= {2, 7, 11, 15};
    	int target=9;
    	int[] output= {0,0};

    	System.out.print("Heere");
    	for(int i=0;i<arr.length;i++)
    	{
    		if(((i+1)<arr.length)&&(arr[i]+arr[i+1]==target))
    		{
    			
    			System.out.print("Heere");
    			output[0]=i;
    			output[1]=i+1;
    		}
    		
    	}

    	System.out.println(output[0]+output[1]);
      
        
        
    }
}



package com.pdp.incubationProgram;

import java.util.Arrays;

public class TrapRainWaterProgram {

	public static void main(String[] args) {

		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		trap(arr);
	}

	public static void trap(int[] height) {
		
		int result = 0;
		if(height==null || height.length<=2)
	        return ;
			
	    int left[] = new int[height.length];
	    int right[]= new int[height.length];
	 
	    //scan from left to right
	    //{0,1,0,2,1,0,1,3,2,1,2,1};
	    int max = height[0];
	    left[0] = height[0];
	    for(int i=1; i<height.length; i++){
	        if(height[i]<max){
	            left[i]=max;
	        }else{
	            left[i]=height[i];
	            max = height[i];
	        }
	    }
	    
	    //{0,1,0,2,1,0,1,3,2,1,2,1};
	    max = height[height.length-1];
	    right[height.length-1]=height[height.length-1];
	    for(int i=height.length-2; i>=0; i--){
	        if(height[i]<max){
	            right[i]=max;
	        }else{
	            right[i]=height[i];
	            max = height[i];
	        }
	    }
	    
	    System.out.println("max :"+max);
	    System.out.println(Arrays.toString(left));
	    System.out.println(Arrays.toString(right));
	    
	    for(int i=0; i<height.length; i++){
	        result+= Math.min(left[i],right[i])-height[i];
	    }
	}
	
	
}

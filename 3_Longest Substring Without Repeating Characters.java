public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if(length == 0)
         return 0;
	        int p=0;
	        int q=1;
	        int max = 1;
	        int isEqual = 0;;
	        while(q <= length-1){
	        	isEqual = 0;        	
	            int i=p;
	            for(i=p;i<q;i++){
	                if(s.charAt(i) == s.charAt(q)){
	                    if(q-p > max){
	                    max = q-p;
	                    }
	                    isEqual = 1;
	                    break;
	                }	                       
	            }
	            if(isEqual != 1){
	                if(q-p+1 > max)
	                  max = q-p+1;
	                q++;
	            }else{
	                p = i+1;
	            }
	            if(p == q)
	                q++;
	        }
	        return max;
    }
}
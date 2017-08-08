public class Solution {
    public String longestPalindrome(String s) {
        boolean table[][] = new boolean[s.length()][s.length()];
    	int resI = 0;
        int len = 1;
        int maxLen = 1;
    	for(int i =0;i<s.length();i++){
    		table[i][i] = true;
    		
    	}
        for(int i =0;i<s.length()-1;i++)
            if( s.charAt(i) == s.charAt(i+1)){
                    table[i][i+1] =true;
                    if(maxLen < 2){
    						maxLen = 2;
    					    resI = i;
    					} 
                }
    			
  for (len = 3; len <= s.length(); len++) {  
    for (int i = 0; i < s.length()-len+1; i++) {  
      int j = i+len-1;  
      if (s.charAt(i) == s.charAt(j) && table[i+1][j-1]) {  
        table[i][j] = true;  
        resI = i;  
        maxLen = len;  
      }  
    }  
  } 
     return s.substring(resI, resI+maxLen);
    }
}
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        
        String str = my_string.replaceAll("[^0-9]","");
        
        int[] intarray = new int[str.length()];
            
        for(int i =0 ; i < str.length() ; i++ ){
            
            intarray[i] = Character.getNumericValue(str.charAt(i));
        }
        
        Arrays.sort(intarray);
        
    
        
        return intarray;
    }
}

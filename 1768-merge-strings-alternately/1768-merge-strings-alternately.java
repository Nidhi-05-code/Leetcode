class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int A = word1.length(); 
        int B = word2.length();
        int i = 0;
        while( i < A || i < B){
            if ( i < A){
                result.append(word1.charAt(i));
            }
            if( i < B){
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}
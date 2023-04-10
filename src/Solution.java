class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i = 0; i< word.length(); i++){
            sb.append(word.charAt(i));
            if(word.charAt(i) == ch && count < 1){
                sb.reverse();
                count++;
            }
        }
        return sb.toString();
    }
}
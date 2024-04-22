class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String compare = "";
        for(int i =0;i<words.length;i++){
            compare+=words[i];
            if(compare.equals(s))return true;
        }
        return false;
    }

}
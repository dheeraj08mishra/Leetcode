class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf(part) > -1) {
            int index = sb.indexOf(part);
            sb.replace(index, index + part.length(), "");
        }
        return sb.toString();
    }
}
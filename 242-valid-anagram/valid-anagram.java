class Solution {
    public boolean isAnagram(String s, String t) {
        char array1[] = s.toCharArray();
        char array2[] = t.toCharArray();
        Arrays.sort(array1);
        s = new String(array1);
        Arrays.sort(array2);
        t = new String(array2);
        return s.equals(t);
    }
}
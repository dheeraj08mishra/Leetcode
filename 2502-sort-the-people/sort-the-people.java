class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=0;i<heights.length;i++){
            if(!hm.containsKey(heights[i])){
                hm.put(heights[i],names[i]);
            }
        }

        Arrays.sort(heights);
        String[]ans= new String[names.length];
        for(int i=0;i<heights.length;i++){
            ans[i] = hm.get(heights[heights.length-1-i]);
        }
        return ans;
    }
}
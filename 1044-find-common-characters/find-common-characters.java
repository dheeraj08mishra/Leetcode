class Solution {
    public List<String> commonChars(String[] words) {
        List<String> al = new ArrayList<>();
        int firstpointer = 0, secondPointer = 1;
        String firstWord = words[firstpointer];
        if (words.length == 1) {
            for (int i = 0; i < firstWord.length(); i++) {
                al.add(Character.toString(firstWord.charAt(i)));
            }
            return al;
        }
        HashMap<Character, Integer> firstwordHashMap = new HashMap<>();
        for (int i = 0; i < firstWord.length(); i++) {
            if (firstwordHashMap.containsKey(firstWord.charAt(i))) {
                firstwordHashMap.put(firstWord.charAt(i), firstwordHashMap.get(firstWord.charAt(i)) + 1);
            } else {
                firstwordHashMap.put(firstWord.charAt(i), 1);
            }
        }
        while (secondPointer < words.length) {
            al.clear();
            String secondWord = words[secondPointer];
            for (int i = 0; i < secondWord.length(); i++) {
                if (firstwordHashMap.containsKey(secondWord.charAt(i))) {
                    firstwordHashMap.put(secondWord.charAt(i), firstwordHashMap.get(secondWord.charAt(i)) - 1);
                    al.add(Character.toString(secondWord.charAt(i)));
                    if (firstwordHashMap.get(secondWord.charAt(i)) == 0) {
                        firstwordHashMap.remove(secondWord.charAt(i));
                    }
                }
            }
            firstwordHashMap.clear();
            for (int i = 0; i < al.size(); i++) {
                if (firstwordHashMap.containsKey(al.get(i).charAt(0))) {
                    firstwordHashMap.put(al.get(i).charAt(0), firstwordHashMap.get(al.get(i).charAt(0)) + 1);
                } else {
                    firstwordHashMap.put(al.get(i).charAt(0), 1);
                }
            }
            secondPointer++;
        }
        return al;
    }
}
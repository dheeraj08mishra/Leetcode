class Solution {
    private static int findCount(String s, Character match) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == match) {
                count++;
            }
        }
        return count;
    }

    public int garbageCollection(String[] garbage, int[] travel) {
        int metalLastIndex = -1;
        int glassLastIndex = -1;
        int paperLastIndex = -1;
        int[] prefForMetal = new int[garbage.length];
        int[] prefForGlass = new int[garbage.length];
        int[] prefForPaper = new int[garbage.length];
        for (int i = 0; i < garbage.length; i++) {
            char[] chars = garbage[i].toCharArray();
            for (char c : chars) {
                if (c == 'M') {
                    prefForMetal[i]++;
                    metalLastIndex = i;
                } else if (c == 'G') {
                    prefForGlass[i]++;
                    glassLastIndex = i;
                } else if (c == 'P') {
                    prefForPaper[i]++;
                    paperLastIndex = i;
                }
            }
        }

        int glassTruck = 0, paperTruck = 0, metalTruck = 0;
        glassTruck = prefForGlass[0];
        for (int i = 1; i <= glassLastIndex; i++) {
            glassTruck += prefForGlass[i] * 1 + travel[i - 1];
        }
        metalTruck += prefForMetal[0];
        for (int i = 1; i <= metalLastIndex; i++) {
            metalTruck += prefForMetal[i] + travel[i - 1];
        }
        paperTruck += prefForPaper[0];
        for (int i = 1; i <= paperLastIndex; i++) {
            paperTruck += prefForPaper[i] + travel[i - 1];
        }

        return paperTruck + metalTruck + glassTruck;
    }
}
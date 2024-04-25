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
        int[] prefFormetal = new int[garbage.length];
        int[] prefForglass = new int[garbage.length];
        int[] prefForPaper = new int[garbage.length];
        for (int i = 0; i < garbage.length; i++) {
            int countm = findCount(garbage[i], 'M');
            int countg = findCount(garbage[i], 'G');
            int countp = findCount(garbage[i], 'P');
            {
                prefFormetal[i] = countm;
                if (countm > 0) {
                    metalLastIndex = i;
                }
            }
            {
                prefForglass[i] = countg;
                if (countg > 0) {
                    glassLastIndex = i;
                }
            }
            {
                prefForPaper[i] = countp;
                if (countp > 0) {
                    paperLastIndex = i;
                }
            }
        }

        int glassTruck = 0, paperTruck = 0, metalTruck = 0;
        glassTruck = prefForglass[0];
        for (int i = 1; i <= glassLastIndex; i++) {
            glassTruck += prefForglass[i] * 1 + travel[i - 1];
        }
        metalTruck += prefFormetal[0];
        for (int i = 1; i <= metalLastIndex; i++) {
            metalTruck += prefFormetal[i] + travel[i - 1];
        }
        paperTruck += prefForPaper[0];
        for (int i = 1; i <= paperLastIndex; i++) {
            paperTruck += prefForPaper[i] + travel[i - 1];
        }

        return paperTruck + metalTruck + glassTruck;
    }
}
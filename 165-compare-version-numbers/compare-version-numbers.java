class Solution {
    public int compareVersion(String version1, String version2) {
        String[] versionArray1 = version1.split("\\.");
        String[] versionArray2 = version2.split("\\.");
        int size1 = versionArray1.length;
        int size2 = versionArray2.length;
        if (size2 == size1) {
            int p1 = 0;
            while (p1 < size1) {
                if (Integer.parseInt(versionArray1[p1]) > Integer.parseInt(versionArray2[p1])) {
                    return 1;
                } else if (Integer.parseInt(versionArray1[p1]) < Integer.parseInt(versionArray2[p1])) {
                    return -1;
                } else if (Integer.parseInt(versionArray1[p1]) == Integer.parseInt(versionArray2[p1])) {
                    p1++;
                }
            }
            return 0;
        } else {
            int p1 = 0, p2 = 0;
            while (p1 < size1 && p2 < size2) {
                if (Integer.parseInt(versionArray1[p1]) > Integer.parseInt(versionArray2[p2])) {
                    return 1;
                } else if (Integer.parseInt(versionArray1[p1]) < Integer.parseInt(versionArray2[p2])) {
                    return -1;
                } else if (Integer.parseInt(versionArray1[p1]) == Integer.parseInt(versionArray2[p2])) {
                    p1++;
                    p2++;
                }
            }
            while (p1 < size1) {
                if (Integer.parseInt(versionArray1[p1]) > 0) {
                    return 1;
                } else {
                    p1++;
                }
            }
            while (p2 < size2) {
                if (Integer.parseInt(versionArray2[p2]) > 0) {
                    return -1;
                } else {
                    p2++;
                }
            }
        }
        return 0;

    }
}
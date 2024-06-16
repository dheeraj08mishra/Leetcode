class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int event1Start = convertToMinutes(event1[0]);
        int event1End = convertToMinutes(event1[1]);
        int event2Start = convertToMinutes(event2[0]);
        int event2End = convertToMinutes(event2[1]);
        return ((event1Start <= event2End) && (event1End >= event2Start));
    }

    private static int convertToMinutes(String first) {
        String[] parts = first.split(":");
        int hour = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);
        return hour * 60 + min;
    }
}
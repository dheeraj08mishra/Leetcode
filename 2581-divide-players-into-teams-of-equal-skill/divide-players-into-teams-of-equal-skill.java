class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int pointer1 = 0, pointer2 = skill.length - 1;
        int currentSum = skill[pointer1] + skill[pointer2];
        for (int i = 0; i < skill.length; i++) {
            if (skill[i] + skill[skill.length - 1 - i] != currentSum) {
                return -1;
            }

        }
        long ans = 0;
        pointer1 = 0;
        pointer2 = skill.length - 1;
        while (pointer1 <= pointer2) {
            ans += skill[pointer1] * skill[pointer2];
            pointer1++;
            pointer2--;
        }
        return ans;
    }
}
// Last updated: 11/11/2025, 9:51:45 PM
class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int totalSkill = skill[0] + skill[n-1];
        long chemistry = skill[0] * skill[n-1];
        int left = 1, right = n-2;
        while(left < right) {
            if(skill[left]+skill[right] == totalSkill) {
                chemistry = chemistry + (skill[left] * skill[right]);
                left++;
                right--;
            } else {
                return -1;
            }
        }
        return chemistry;
    }
}
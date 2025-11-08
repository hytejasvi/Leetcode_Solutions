// Last updated: 11/8/2025, 12:58:40 PM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int left = 0, right = 0;
        while(left < players.length && right < trainers.length) {
            if(players[left] <= trainers[right]) {
                left++;
            }
            right++;
        }
        return left;
    }
}
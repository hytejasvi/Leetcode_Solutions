// Last updated: 11/10/2025, 9:14:18 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> mergedList = new ArrayList<>();
        mergedList.add(intervals[0]);
        for(int i=1;i< intervals.length;i++) {
            int currentStart = intervals[i][0];
            int previousEnd = mergedList.get(mergedList.size()-1)[1];
            if(currentStart <= previousEnd) {
                int start = Math.min(currentStart, mergedList.get(mergedList.size()-1)[0]);
                int end = Math.max(previousEnd, intervals[i][1]);
                mergedList.remove(mergedList.size()-1);
                mergedList.add(new int[] {start, end});
            } else {
                mergedList.add(intervals[i]);
            }
        }
        return mergedList.toArray(new int[mergedList.size()][]);
    }
}
class Solution {
    public int maxNumberOfBalloons(String s) {
        String target = "balloon";
        Map<Character, Integer> map = new HashMap<>();
        for (Character c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int j=0;
        int res = 0;
        while(map.containsKey(target.charAt(j)) && map.get(target.charAt(j)) != 0) {
            int ws = 0;
            for(int i=0; i < target.length();i++) {
                if(map.containsKey(target.charAt(i))) {
                    map.put(target.charAt(i), map.get(target.charAt(i))-1);
                    if(map.get(target.charAt(i)) < 1) {
                        map.remove(target.charAt(i));
                    }
                    ws++;
                } else {
                    return res;
                }
                if(ws == target.length()) {
                    res++;
                    ws=0;
                }
            }
        }
        return res;
    }
}
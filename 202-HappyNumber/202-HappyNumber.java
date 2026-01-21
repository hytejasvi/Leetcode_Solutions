// Last updated: 1/21/2026, 10:05:45 PM
class Solution {
    int sum_digits(int n)
    {
        int m=0;
        while(n>0)
        {
            m+=Math.pow(n%10,2);
            n=n/10;
        }
        return m;
        
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();

        while(n!=1)
        {
            set.add(n);
            n=sum_digits(n);
            if(set.contains(n))
            {
                return false;
            }
        }

        return true;
    }
}
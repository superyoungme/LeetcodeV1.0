class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for(int i=0;i<S.length();i++) {
            char charS = S.charAt(i);
            if(J.indexOf(charS) != -1) {
                count ++;
            }
        }
        return count;
    }
}
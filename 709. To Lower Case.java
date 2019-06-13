class Solution {
    public String toLowerCase(String str) {
        StringBuffer lower = new StringBuffer();
        for(int i=0;i<str.length();i++) {
            char oneChar = str.charAt(i);
            if(oneChar <= 90 && oneChar >= 65) {
                oneChar = (char)(oneChar + 32);
            }
            lower.append(oneChar);
        }
        return lower.toString();
    }
}
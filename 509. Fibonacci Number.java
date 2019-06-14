class Solution {
    public int fib(int N) {
        if(N == 0) return 0;
        if(N == 1) return 1;
        int a = 0;
        int b = 1;
        int temp;
        while(N > 1) {
            temp = a;
            a = b;
            b = b + temp;
            N--;
        }
        return b;
    }
}
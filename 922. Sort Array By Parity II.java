/*
 * Âé·³ÁË
 */
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        List<Integer> swapList1 = new ArrayList<Integer>();
        List<Integer> swapList2 = new ArrayList<Integer>();
        for(int i=0;i<A.length;i++) {
            if(A[i] % 2 == 0 && i %2 != 0) {
                swapList1.add(i);
            }
            else if(A[i] %2 != 0 && i % 2 == 0) {
                swapList2.add(i);
            }
        }
        for(int i=0;i<swapList1.size();i++) {
            swap(A, swapList1.get(i), swapList2.get(i));
        }
        return A;
    }
    
    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
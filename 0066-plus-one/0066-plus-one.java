import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger sum = BigInteger.ZERO;
        for(int i : digits){
            sum = sum.multiply(BigInteger.TEN).add(BigInteger.valueOf(i));
        }
       sum = sum.add(BigInteger.ONE);
        String s = String.valueOf(sum);
        String[] a = s.split("");
        int[] arr = new int[a.length];
        int i = 0;
        for(String j : a){
            arr[i] = Integer.parseInt(j);
            i++;
        }
        return arr;
    }
}
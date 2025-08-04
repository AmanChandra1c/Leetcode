class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] temp = new int[nums1.length+nums2.length];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                temp[k] = nums1[i];
                k++;
                i++;
            }else{
                temp[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (i < nums1.length || j < nums2.length) {
            temp[k++] = (i < nums1.length) ? nums1[i++] : nums2[j++];
        }


        double res = 0;

        if(temp.length % 2 == 0){
            int idx = temp.length / 2;
            res = (temp[idx]+temp[idx-1])/2.0;
        } else {
            int idx = temp.length / 2;
            res = temp[idx];
        }


        return res;
    }
}
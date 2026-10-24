class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       int i = 0 , j =0 , n1 = nums1.length , n2 = nums2.length;
       int k = 0;
       int arr[] = new int[Math.min(n1,n2)];
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       while(i < n1 && j < n2){
        if(nums1[i]<nums2[j]){
            i++;
        }
        else if(nums1[i]>nums2[j]){
            j++;
        }
        else{
            arr[k++] = nums1[i];
            i++;
            j++; 
        }
       }
       return Arrays.copyOfRange(arr,0,k);
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        int[] ans = new int[nums2.length];
        int p = 0;

        for(int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++) {

            if(set.contains(nums2[i])) {
                ans[p] = nums2[i];
                p++;

                set.remove(nums2[i]);
            }
        }

        return Arrays.copyOf(ans, p);
    }
}
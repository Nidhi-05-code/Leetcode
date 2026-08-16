class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        boolean[] seen = new boolean[1001];

        for (int i = 0; i < nums1.length; i++) {
            seen[nums1[i]] = true;
        }

        int[] result = new int[1001];
        int count = 0;

        for (int j = 0; j < nums2.length; j++) {

            if (seen[nums2[j]]) {
                result[count] = nums2[j];
                count++;

                seen[nums2[j]] = false;
            }
        }

        return Arrays.copyOf(result, count);
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                int currNum = num;

                while (numSet.contains(currNum + 1)) {
                    length = length + 1;
                    currNum = currNum + 1;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}


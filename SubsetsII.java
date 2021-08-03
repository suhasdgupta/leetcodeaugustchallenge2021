class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList();
        ans.add(new ArrayList()); // add []
        for (int i = 0, prev = 0; i < nums.length; i++) {
            int size = ans.size();
                for (int j = (i == 0 || nums[i] != nums[i - 1]) ? 0 : prev; j < size; j++) {
                    List<Integer> cur = new ArrayList(ans.get(j));
                    cur.add(nums[i]);
                    ans.add(cur);
                }
            prev = size;
        }
        return ans;
    }
}

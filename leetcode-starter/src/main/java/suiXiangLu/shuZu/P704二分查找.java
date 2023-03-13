package suiXiangLu.shuZu;

import cn.adalab.leetcode.helpers.SolutionRunner;

public class P704二分查找 extends SolutionRunner {
    @Override
    public void run() {
        System.out.println(search(new int[]{5}, 2));
    }

    public int search(int[] nums, int target) {

        if (nums[0] > target || nums[nums.length -1] < target){
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;


    }





}

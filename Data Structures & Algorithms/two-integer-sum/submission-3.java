class Solution {
    public int[] twoSum(int[] nums, int target) {

    HashMap<Integer,Integer> hSet = new HashMap<>();
    int[] answer = new int[2];


    for (int i = 0; i < nums.length; i++) { 

        int number = nums[i];
        int remainder = target - number;

        if (hSet.containsKey(remainder) 
        ) {
                answer[0] = hSet.get(remainder);
                answer[1] = i;
            
            break;
        }

        if (!hSet.containsKey(nums[i])) {
            hSet.put(number,i);
        }

    }

    return answer;
        
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

    HashMap<Integer,Integer> hMap = new HashMap<>();

    for (int num : nums) {

        hMap.putIfAbsent(num,0);
        hMap.put(num, hMap.get(num) + 1);

    }

    int[] frequentNums = new int[k];
    List<Integer> sortedFrequencies = new ArrayList<>(hMap.keySet());
    sortedFrequencies.sort((a,b) -> hMap.get(b) - hMap.get(a));
    for (int i = 0; i < k; i++) {

        frequentNums[i] = sortedFrequencies.get(i);

    }

    return frequentNums;
        
    }
}

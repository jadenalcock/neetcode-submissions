class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    HashMap<List<Integer>, List<String>> hMap = new HashMap<>();
        

    for (String word : strs) {

    int[] letters = letterCount(word);
    List<Integer> key = Arrays.stream(letters).boxed().collect(Collectors.toList());
    hMap.putIfAbsent(key, new ArrayList<String>());
    hMap.get(key).add(word);
    }

    return new ArrayList<>(hMap.values());


    }

    private int[] letterCount(String string) {

        int[] letters = new int[26];
        for (int i = 0; i < string.length(); i++) {

            letters[string.charAt(i) - 'a'] = letters[string.charAt(i) - 'a'] + 1;

        }
        
        return letters;


    }

    
}
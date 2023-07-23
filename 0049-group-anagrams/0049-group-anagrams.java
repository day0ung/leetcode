class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);

            map.computeIfAbsent(new String(charArr), 
                    key -> new ArrayList<>()).add(str);
        }
        List<List<String>> group = map.values().stream()
                .sorted(Comparator.comparing(List::size))
                .collect(Collectors.toList());
        
        return group;
        
        
    }
}
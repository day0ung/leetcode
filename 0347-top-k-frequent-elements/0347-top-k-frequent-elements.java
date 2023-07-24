class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        Arrays.stream(nums).forEach(s-> {
            map.computeIfAbsent(s , key -> new ArrayList<>()).add(s);
        });
        
        int[] list = map.keySet().stream()
                .sorted(Comparator.comparingInt(key ->                      map.get(key).size()).reversed())
                .limit(k)
                .mapToInt(Integer::intValue).toArray();
        return list;
    }
}
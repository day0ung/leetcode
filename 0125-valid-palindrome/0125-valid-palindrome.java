class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.print(str);
        String[] arr = str.split("");
        
        boolean isP = IntStream.range(0, arr.length / 2)
            .allMatch(i -> arr[i].equals(arr[arr.length -i -1]));
        
        // for (int i =0 ; i < arr.length / 2; i ++){
        //     if(!arr[i].equals(arr[arr.length -i -1])){
        //         return false;
        //     }
        // }
        
            
        return isP;
    }
}
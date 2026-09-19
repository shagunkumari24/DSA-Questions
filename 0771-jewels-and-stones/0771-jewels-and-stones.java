class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < jewels.length(); i++) {
            if (!mp.containsKey(jewels.charAt(i))) {
                mp.put(jewels.charAt(i), 1);
            } else {
                mp.put(jewels.charAt(i), (mp.get(jewels.charAt(i)) + 1));
            }
        }

        int sum = 0;

        for (int j = 0; j < stones.length(); j++) {
            if (mp.containsKey(stones.charAt(j))) {
                sum++;
            }
        }

        return sum;
    }
}
class Solution {

    public boolean isValid(HashMap<Character, Integer> map1,
                           HashMap<Character, Integer> map2) {

        for (char ch : map1.keySet()) {

            if (map2.getOrDefault(ch, 0) < map1.get(ch)) {
                return false;
            }
        }

        return true;
    }

    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            map1.put(ch, map1.getOrDefault(ch, 0) + 1);

            set.add(ch);
        }

        int start = 0;
        int end = Integer.MAX_VALUE;

        int left = 0;

        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (set.contains(ch)) {

                map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            }

            while (isValid(map1, map2)) {

                if (i - left + 1 < diff) {

                    diff = i - left + 1;

                    start = left;

                    end = i;
                }

                char remove = s.charAt(left);

                if (set.contains(remove)) {

                    map2.put(remove, map2.get(remove) - 1);

                    if (map2.get(remove) == 0) {

                        map2.remove(remove);
                    }
                }

                left++;
            }
        }

        return end == Integer.MAX_VALUE
                ? ""
                : s.substring(start, end + 1);
    }
}
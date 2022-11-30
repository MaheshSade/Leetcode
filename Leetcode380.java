package org.leetcode;

import java.util.*;

class Leetcode380 {
    Set<Integer> set = new HashSet<>();
    List<Integer> list = new ArrayList<>();

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        list = set.stream().toList();
        int index = new Random().nextInt(list.size());
        return list.get(index);

//        return set.stream().skip(new Random().nextInt(set.size())).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        Leetcode380 leetcode380 = new Leetcode380();

    }
}
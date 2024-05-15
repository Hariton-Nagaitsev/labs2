package src.labs.lab09;

import java.time.Instant;
import java.util.*;

public class Collections {
    public static LinkedHashSet<String> removeDuplicates(List<String> list) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.addAll(list);
        return set;
    }

    public static int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static List<Integer> millArray() {
        List<Integer> list = new ArrayList<>(1000000);
        for (int i = 0; i < 1000000; i++) {
            list.add(getRandom(0, 10000000));
        }
        return list;
    }

    public static List<Integer> millLinked() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(getRandom(0, 10000000));
        }
        return list;
    }

    public static String randomElements(List<Integer> list) {
        int a;
        Instant start = Instant.now();
        for (int i = 0; i < 100000; i++) {
            a = list.get(getRandom(0, list.size() - 1));
        }
        Instant end = Instant.now();
        return "Duration is: " + (end.toEpochMilli() - start.toEpochMilli()) + " ms";
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ab");
        list.add("bc");
        list.add("ca");
        list.add("ab");
        list.add("cd");
        list.add("da");
        LinkedHashSet<String> set = removeDuplicates(list);
        System.out.println(set);

        List<Integer> list1 = millArray();
        System.out.println("ArrayList: " + randomElements(list1));

        List<Integer> list2 = millLinked();
        System.out.println("LinkedList: " + randomElements(list2));

    }
}

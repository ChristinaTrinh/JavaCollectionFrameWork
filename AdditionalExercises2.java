import java.util.*;

public class AdditionalExercises2 {
    public static void main(String[] args) {
        System.out.println("alternate method: ");
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.add(11);
        l2.add(12);
        System.out.println("list1 = " + l1.toString());
        System.out.println("list2 = " + l2.toString());
        System.out.println("result = " + alternate(l1, l2));
        l1.clear();
        l2.clear();
        System.out.println();

        System.out.println("removeInRange method: ");
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        l3.add(0);
        l3.add(0);
        l3.add(2);
        l3.add(0);
        l3.add(4);
        l3.add(0);
        l3.add(6);
        l3.add(0);
        l3.add(8);
        l3.add(0);
        l3.add(10);
        l3.add(0);
        l3.add(12);
        l3.add(0);
        l3.add(14);
        l3.add(0);
        l3.add(16);
        removeInRange(l3, 0, 5, 13);
        System.out.println("result = " + l3);
        System.out.println();

        System.out.println("partition method: ");
        l1.add(15);
        l1.add(1);
        l1.add(6);
        l1.add(12);
        l1.add(-3);
        l1.add(4);
        l1.add(8);
        l1.add(21);
        l1.add(2);
        l1.add(30);
        l1.add(-1);
        l1.add(9);
        partition(l1, 5);
        System.out.println("result = " + l1);
        l1.clear();
        System.out.println();

        System.out.println("sortAndRemoveDuplicates method: ");
        l1.add(7);
        l1.add(4);
        l1.add(-9);
        l1.add(4);
        l1.add(15);
        l1.add(8);
        l1.add(27);
        l1.add(7);
        l1.add(11);
        l1.add(-5);
        l1.add(32);
        l1.add(-9);
        l1.add(-9);
        sortAndRemoveDuplicates(l1);
        System.out.println("result = " + l1);
        l1.clear();
        System.out.println();

        System.out.println("countUnique method: ");
        l1.add(3);
        l1.add(7);
        l1.add(3);
        l1.add(-1);
        l1.add(2);
        l1.add(3);
        l1.add(7);
        l1.add(2);
        l1.add(15);
        l1.add(15);
        System.out.println("number of unique integer values in the list is: " + countUnique(l1));
        System.out.println();

        System.out.println("countCommon method: ");
        l2.add(-5);
        l2.add(15);
        l2.add(2);
        l2.add(-1);
        l2.add(7);
        l2.add(15);
        l2.add(36);
        System.out.println("number of unique integers that occur in both lists is: " + countCommon(l1, l2));
        l2.clear();
        System.out.println();

        System.out.println("maxLength method: ");
        Set<String> set1 = new HashSet<String>();
        set1.add("hello");
        set1.add("how");
        set1.add("are");
        set1.add("you");
        set1.add("today?");
        System.out.println("length of longest string is: " + maxLength(set1));
        System.out.println();

        System.out.println("hadOdd method: ");
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(2);
        set2.add(4);
        set2.add(6);
        set2.add(8);
        set2.add(9);
        System.out.println("the set has odd value: " + hasOdd(set2));
        set2.clear();
        System.out.println();

        System.out.println("removeEvenLength method: ");
        System.out.println("set before removing: " + set1);
        removeEvenLength(set1);
        System.out.println("set after removing: " + set1);
        System.out.println();

        System.out.println("symmetricSetDifference method: ");
        set2.add(1);
        set2.add(4);
        set2.add(7);
        set2.add(9);
        Set<Integer> set3 = new HashSet<Integer>();
        set3.add(2);
        set3.add(4);
        set3.add(5);
        set3.add(6);
        set3.add(7);

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("symmetric difference between 2 sets is: "
                + symmetricSetDifference(set2, set3));
        set2.clear();
        set3.clear();
        System.out.println();

        System.out.println("contains3 method: ");
        List<String> l4 = new LinkedList<String>();
        l4.add("hello");
        l4.add("hi");
        l4.add("how");
        l4.add("are");
        l4.add("you");
        l4.add("hello");
        l4.add("hello");
        System.out.println("The list contains a string for 3 times: " + contains3(l4));
        l3.clear();
        System.out.println();

        System.out.println("isUnique method: ");
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("Kendrick", "Perkins");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Bruce", "Reges");
        map1.put("Hal", "Perkins");
        System.out.println("The map is: " + map1.toString());
        System.out.println("The map is unique: " + isUnique(map1));
        map1.clear();
        System.out.println();

        System.out.println("intersect method: ");
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        Map<String, Integer> map3 = new HashMap<String, Integer>();
        map2.put("Janet", 87);
        map2.put("Logan", 62);
        map2.put("Whitaker", 46);
        map2.put("Alyssa", 100);
        map2.put("Stefanie", 80);
        map2.put("Jeff", 88);
        map2.put("Kim", 52);
        map2.put("Sylvia", 95);

        map3.put("Logan", 62);
        map3.put("Kim", 52);
        map3.put("Whitaker", 52);
        map3.put("Jeff", 88);
        map3.put("Stefanie", 80);
        map3.put("Brian", 60);
        map3.put("Lisa", 83);
        map3.put("Sylvia", 87);
        System.out.println("intersect map = " + intersect(map2, map3));
        map2.clear();
        map3.clear();
        System.out.println();

        System.out.println("maxOccurrences method: ");
        System.out.println("List = " + l1);
        System.out.println("The mode of this list is: " + maxOccurrences(l1));
        l1.clear();
        System.out.println();

        System.out.println("is1to1 method: ");
        map1.put("Marty", "206-9024");
        map1.put("Hawking", "123-4567");
        map1.put("Smith", "949-0504");
        map1.put("Newton", "123-4567");
        System.out.println("The map is: " + map1);
        System.out.println("The map is 1 to 1: " + is1to1(map1));
        System.out.println();

        map1.put("Hawking", "555-1234");
        System.out.println("The map is: " + map1);
        System.out.println("The map is 1 to 1: " + is1to1(map1));
        System.out.println();

        System.out.println("subMap method: ");
        map1.put("Hawking", "123-4567");
        Map<String, String> map4 = new HashMap<String, String>();
        map4.put("Smith", "949-0504");
        map4.put("Marty", "206-9024");
        System.out.println("Map 1 = " + map4);
        System.out.println("Map 2 = " + map1);
        System.out.println("Map 1 is subMap of Map 2: " + subMap(map4, map1));
        map1.clear();
        map4.clear();
        System.out.println();

        System.out.println("reverse method: ");
        Map<Integer, String> map5 = new HashMap<Integer, String>();
        map5.put(42, "Marty");
        map5.put(81, "Sue");
        map5.put(17, "Ed");
        map5.put(31, "Dave");
        map5.put(56, "Ed");
        map5.put(3, "Marty");
        map5.put(29, "Ed");
        System.out.println("The map before reversing = " + map1);
        System.out.println("The map after reversing = " + reverse(map5));
        map1.clear();
        System.out.println();

        System.out.println("rarest method: ");
        map2.put("hello", 1);
        map2.put("hi", 1);
        map2.put("how", 1);
        map2.put("are", 2);
        map2.put("you", 3);
        System.out.println("The value that occurs fewest times in the map is: "
                + rarest(map2));
        map2.clear();
        System.out.println();
    }

    public static List<Integer> alternate(List<Integer> l1, List<Integer> l2) {
        Iterator<Integer> i1 = l1.iterator();
        Iterator<Integer> i2 = l2.iterator();
        List<Integer> l3 = new ArrayList<Integer>();

        while (i1.hasNext() || i2.hasNext()) {
            if (i1.hasNext())
                l3.add(i1.next());
            if (i2.hasNext())
                l3.add(i2.next());
        }
        return l3;
    }

    public static void removeInRange(LinkedList<Integer> list, int value, int start, int end) {
        Iterator<Integer> i = list.iterator();
        int currentIndex = 0;
        while (currentIndex < start && i.hasNext()) {
            i.next();
            currentIndex++;
        }

        while (currentIndex < end && i.hasNext()) {
            int num = i.next();
            if (num == value)
                i.remove();
            currentIndex++;
        }
    }

    public static void partition(List<Integer> list, int value) {
        Iterator<Integer> i = list.iterator();
        int indexToSwap = 0;
        int index = -1;
        while (i.hasNext()) {
            int num = i.next();
            index++;
            if (num < value) {
                Collections.swap(list, indexToSwap, index);
                indexToSwap++;
            }
        }
    }

    public static void sortAndRemoveDuplicates(List<Integer> list) {
        Set<Integer> set = new TreeSet<Integer>(list);
        list.clear();
        Iterator<Integer> i = set.iterator();
        while (i.hasNext())
            list.add(i.next());
    }

    public static int countUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<Integer>(list);
        return set.size();
    }

    public static int countCommon(List<Integer> l1, List<Integer> l2) {
        Set<Integer> intersect = new HashSet<Integer>(l1);
        Set<Integer> set2 = new HashSet<Integer>(l2);
        intersect.retainAll(set2);
        return intersect.size();
    }

    public static int maxLength(Set<String> set) {
        Iterator<String> i = set.iterator();
        int max = 0;
        while (i.hasNext()) {
            String str = i.next();
            if (str.length() > max)
                max = str.length();
        }
        return max;
    }

    public static boolean hasOdd(Set<Integer> set) {
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            int num = i.next();
            if (num % 2 != 0)
                return true;
        }
        return false;
    }

    public static void removeEvenLength(Set<String> set) {
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            String str = i.next();
            if (str.length() % 2 == 0)
                i.remove();
        }
    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> s1, Set<Integer> s2) {
        // store s1 into s3 so removeAll wouldn't affect s1
        Set<Integer> s3 = new HashSet(s1);
        s3.removeAll(s2);

        // store s2 into s4 so removeAll wouldn't affect s2
        Set<Integer> s4 = new HashSet(s2);
        s4.removeAll(s1);
        Iterator<Integer> i = s4.iterator();
        while (i.hasNext()) {
            s3.add(i.next());
            i.remove();
        }
        return s3;
    }

    public static boolean contains3(List<String> list) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            String str = i.next();
            if (!map.containsKey(str)) // if the str was first found, then the occurence=1
                map.put(str, 1);
            else {
                int n = map.get(str);
                map.put(str, n + 1); // increase 1 if we found another occurence for the same str
                if ((n + 1) == 3)
                    return true;
            }
        }
        return false;
    }

    public static boolean isUnique(Map<String, String> map) {
        Collection<String> values = map.values();
        Set<String> set = new HashSet<String>(values);
        if (values.size() != set.size())
            return false;
        return true;
    }

    public static Map<String, Integer> intersect(Map<String, Integer> m1, Map<String, Integer> m2) {
        Set<String> keys = new HashSet<String>(m1.keySet());// convert keys in map1 to set
        Collection<Integer> values = m1.values();// convert values in map1 to collection
        Iterator<String> itrKey = keys.iterator(); // iterate over all the keys
        Iterator<Integer> itrValue = values.iterator();// iterate over values at the same time

        // construct the intersect map
        Map<String, Integer> m3 = new HashMap<String, Integer>();

        // iterate over the keys and values in map 1 to check for intersection
        while (itrKey.hasNext() && itrValue.hasNext()) {
            String key = itrKey.next();
            int valueMap1 = itrValue.next();
            if (m2.containsKey(key)) // if map 2 does contain this key
            {
                int valueMap2 = m2.get(key); // then get the value associate with the key in map 2
                if (valueMap1 == valueMap2) // if key=key & value=value => intersection => add to map 3
                    m3.put(key, valueMap1);
            }
        }
        return m3;
    }

    public static int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Iterator<Integer> i1 = list.iterator();
        while (i1.hasNext()) {
            int num = i1.next();
            if (!map.containsKey(num)) // if the number not existing in the map then add it and occureence of 1
                map.put(num, 1);

            // if the number existed in the map then increase the occurrence by 1
            else
                map.put(num, map.get(num) + 1);

        }

        // put all values into a collection to compare the occurrences
        Collection<Integer> values = map.values();
        Iterator<Integer> i2 = values.iterator();
        int mode = 0;
        while (i2.hasNext()) {
            int value = i2.next();
            if (value > mode)
                mode = value;
        }
        return mode;
    }

    public static boolean is1to1(Map<String, String> map) {
        Collection<String> values = map.values();
        Set<String> set = new HashSet<String>(values);
        if (values.size() != set.size())
            return false;
        return true;
    }

    public static boolean subMap(Map<String, String> m1, Map<String, String> m2) {
        Set<String> keyMap1 = m1.keySet();// convert the keys in m1 to a set
        Collection<String> valueMap1 = m1.values();
        Iterator<String> itrKey = keyMap1.iterator();
        Iterator<String> itrValue = valueMap1.iterator();
        int count = 0; // if the count reaches the size of m1 then it is a subMap of m2
        while (itrKey.hasNext() && itrValue.hasNext()) {
            String key = itrKey.next();
            String valueM1 = itrValue.next();
            if (m2.containsKey(key)) {
                String valueM2 = m2.get(key);
                if (valueM1 == valueM2)
                    count++;
            }

        }
        if (count == m1.size())
            return true;
        return false;
    }

    public static Map<String, Set<Integer>> reverse(Map<Integer, String> map) {
        Map<String, Set<Integer>> reverseMap = new HashMap<String, Set<Integer>>();
        for (int n : map.keySet()) {
            String value = map.get(n);
            if (reverseMap.containsKey(value))
                reverseMap.get(value).add(n);
            else {
                Set<Integer> list = new HashSet<Integer>();
                list.add(n);
                reverseMap.put(value, list);
            }
        }
        return reverseMap;
    }

    public static int rarest(Map<String, Integer> map1) {
        if (map1.isEmpty())// throws an exception if the passed in map is empty
            throw new IllegalArgumentException();

        Collection<Integer> values = map1.values();// put values of map1 into a collection

        // this is the map of the values and its number of occurrence
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        Iterator<Integer> i1 = values.iterator();

        // add keys/values into map 2
        while (i1.hasNext()) {
            int num = i1.next();
            if (!map2.containsKey(num)) // if the number not existing in the map then add it and occureence of 1
                map2.put(num, 1);

            // if the number existed in the map then increase the occurrence by 1
            else
                map2.put(num, map2.get(num) + 1);

        }

        Collection<Integer> occurrences = map2.values();// put the occurrences of values into collection
        Iterator<Integer> i2 = occurrences.iterator();
        Set<Integer> key = map2.keySet();// put the values into a set
        Iterator<Integer> i3 = key.iterator();
        int leastCount = i2.next(); // set the least occurence to the first one
        int leastKey = i3.next();// set the least key associate with it to the first one
        while (i2.hasNext() && i3.hasNext()) {
            int v = i2.next();
            int k = i3.next();
            if (v < leastCount) { // compare the occurences and set the lesser occurrence and its value into a
                                  // variable
                leastCount = v;
                leastKey = k;
            }
        }
        return leastKey;
    }

}

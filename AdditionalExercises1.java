import java.util.*;

public class AdditionalExercises1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(7);
        l1.add(7);
        l1.add(11);
        System.out.println("countDuplicates method: ");
        System.out.println("There is a total of " + countDuplicates(l1) + " duplicates.");
        l1.clear();

        LinkedList<String> l2 = new LinkedList<String>();
        l2.add("Alpha");
        l2.add("Baker");
        l2.add("Foxtrot");
        l2.add("Tango");
        l2.add("Whiskey");
        System.out.println("insertInOrder method: ");
        System.out.println("Before inserting: " + l2);
        insertInOrder(l2, "Charlie");
        System.out.println("After inserting: " + l2);
        l2.clear();
        System.out.println();

        System.out.println("removeAll method: ");
        l1.add(3);
        l1.add(9);
        l1.add(4);
        l1.add(2);
        l1.add(3);
        l1.add(8);
        l1.add(17);
        l1.add(4);
        l1.add(3);
        l1.add(18);
        l1.add(2);
        l1.add(3);
        System.out.println("Before removing: " + l1);
        removeAll(l1, 3);
        System.out.println("After removing: " + l1);
        l1.clear();
        System.out.println();

        System.out.println("wrapHalf method: ");
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println("Before wrapping: " + l1);
        wrapHalf(l1);
        System.out.println("After wrapping: " + l1);
        l1.clear();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        System.out.println("Before wrapping: " + l1);
        wrapHalf(l1);
        System.out.println("After wrapping: " + l1);
        l1.clear();
        System.out.println();

        System.out.println("countDuplicates method: ");
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        l3.add(1);
        l3.add(1);
        l3.add(3);
        l3.add(5);
        l3.add(5);
        l3.add(5);
        l3.add(5);
        l3.add(7);
        l3.add(7);
        l3.add(11);
        System.out.println("There is a total of " + countDuplicates(l3) + " duplicates.");
        l1.clear();
        System.out.println();
    }

    public static int countDuplicates(LinkedList<Integer> list) {
        int count = 0;
        Iterator<Integer> i = list.iterator();
        int last = i.next();
        while (i.hasNext()) {
            int next = i.next();
            if (last == next) {
                count++;
            }
            last = next;
        }
        return count;
    }

    public static void insertInOrder(LinkedList<String> list, String value) {
        int index = 0;
        Iterator<String> i = list.iterator();
        String next = i.next();

        // loop until found the right place to insert the new value
        while (i.hasNext() && next.compareTo(value) < 0) {
            next = i.next();
            index++;
        }

        list.add(index, value);
    }

    public static void removeAll(LinkedList<Integer> list, int value) {
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()) {
            if (i.next() == value) {
                i.remove();
            }
        }
    }

    public static void wrapHalf(LinkedList<Integer> list) {
        int halfSize = (list.size() + 1) / 2;
        for (int i = 0; i < halfSize; i++) {
            // wrap around one element
            int element = list.remove(list.size() - 1);
            list.add(0, element);
        }
    }

    public static int countDuplicates(List<Integer> list) {
        int count = 0;
        Iterator<Integer> i = list.iterator();
        int prev = i.next();
        while (i.hasNext()) {
            int next = i.next();
            if (prev == next) {
                count++;
            }
            prev = next;
        }
        return count;
    }
}

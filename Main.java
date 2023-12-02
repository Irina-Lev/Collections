import java.util.*;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ivanov");
        arrayList.add("Sidorov");
        arrayList.add("Ivanov");
        System.out.println(arrayList);
        System.out.println(taskThree(arrayList));
    }

    static ArrayList<String> taskThree(ArrayList array) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(array);
        array.clear();
        array.addAll(hashSet);
        return array;
    }

    static void taskOne() {
        HashMap<String, Integer> oldMap = new HashMap<>();
        oldMap.put("Ivan", 20);
        oldMap.put("Vadim", 25);

        System.out.println("Old map: " + oldMap);

        HashMap<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : oldMap.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("New map: " + newMap);
    }

    static void taskTwo() {
        ArrayList<Integer> numberArrayList = new ArrayList<>();
        LinkedList<Integer> numberLinkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            numberArrayList.add((int) (Math.random() * 1000000));
            numberLinkedList.add((int) (Math.random() * 1000000));
        }


        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            numberArrayList.get((int) (Math.random() * 1000000));
        }
        long finish = System.nanoTime();
        long passed = finish - start;
        System.out.println("ArrayList took time " + passed + " nanoseconds.");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            numberLinkedList.get((int) (Math.random() * 1000000));
        }
        finish = System.nanoTime();
        passed = finish - start;
        System.out.println("LinkedList took time " + passed + " nanoseconds.");
    }

}

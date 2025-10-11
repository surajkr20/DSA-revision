package Hashing;


public class MyHashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        // insertion
        set.add(54);
        set.add(55);
        set.add(53);

        // deletion
        set.remove(53);

        // search
        System.out.println(set.contains(55));

        

        System.out.println(set);
    }
}

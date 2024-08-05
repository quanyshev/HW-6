public class Main {
    public static void main(String[] args) {
        //check MyArrayList
        MyArrayList arr = new MyArrayList();

        arr.put("Me");
        arr.put("You");
        arr.put("He");

        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));

        arr.delete(0);

        //check MyHashSet
        MyHashSet<String> hs = new MyHashSet();

        hs.put("Me");
        hs.put("You");
        hs.put("He");
        hs.put("He");
        hs.put("He");

        System.out.println(hs.contains("Me"));

        hs.delete("He");

        for (String s : hs) {
            System.out.println(s);
        }
    }
}